<?php
  $the_exams = simplexml_load_file("the-exams.xml");
  $file = fopen("inserts.sql","w");

  $students = array();
  $documents = array();
  $aTtypes = array();
  $insts = array();

  $students_ids = array(); 
  $documents_ids = array(); 
  $aTtypes_ids = array(); 
  $insts_ids = array(); 

  $nrthee = 0;

  fprintf($file, "-- THE EXAMS\n");

  foreach ($the_exams->theexam as $thee){
    fprintf($file, "INSERT INTO theexams (id, student_id, document_id, inst_id, date, type_id) VALUES (%s, %s, %s, %s, %s, %s);\n", $nrthee, value_student($thee->student), value_document($thee->document), value_inst($thee->inst), value_date($thee->date), value_aTtype($thee));
      $nrthee++;
  }

  fprintf($file, "-- STUDENTS\n");

  foreach ($students as $student){
    $name = (string) $student->name;
    fprintf($file, "INSERT INTO students (id, name, _id) VALUES (%s, '%s', %s);\n", $students_ids[$name], $name, value_or_NULL($student->id));
  }

  fprintf($file, "-- DOCUMENTS\n");

  foreach ($documents as $document){
    $title = (string) $document->title;
    fprintf($file, "INSERT INTO documents (id, title, thesis) VALUES (%s, '%s', %s);\n", $documents_ids[$title], str_replace("'", '"', $title), value_or_NULL($document->thesis));
  }

  fprintf($file, "-- ATTYPES\n");

  foreach ($aTtypes as $aTtype){
    fprintf($file, "INSERT INTO aTtypes (id, aTtype) VALUES (%s, '%s');\n", $aTtypes_ids[$aTtype], $aTtype);
  }

  fprintf($file, "-- INSTS\n");

  foreach ($insts as $inst){
    $inst_name = (string) $inst;
    fprintf($file, "INSERT INTO insts (id, inst) VALUES (%s, '%s');\n", $insts_ids[$inst_name], $inst_name);
  }

  // FUNCTIONS

  function value_student($student){
    global $students_ids;
    global $students;
    $name = (string) $student->name;

    if(!array_key_exists($name, $students_ids)){
      $students_ids[$name] = sizeof($students_ids);
      array_push($students, $student);
    }
    return $students_ids[$name];
  }

  function value_document($document){
    global $documents_ids;
    global $documents;
    $title = (string) $document->title;

    if(!array_key_exists($title, $documents_ids)){
      $documents_ids[$title] = sizeof($documents_ids);
      array_push($documents, $document);
    }
    return $documents_ids[$title];
  }

  function value_aTtype($thee){
    global $aTtypes_ids;
    global $aTtypes;
    $_aTtype = (string) $thee->attributes()['type'];

    if(!array_key_exists($_aTtype, $aTtypes_ids)){
      $aTtypes_ids[$_aTtype] = sizeof($aTtypes_ids);
      array_push($aTtypes, $_aTtype); 
    }
    return $aTtypes_ids[$_aTtype];
  }

  function value_inst($inst){
    global $insts_ids;
    global $insts;
    $inst_name = (string) $inst;

    if(!array_key_exists($inst_name, $insts_ids)){
      $insts_ids[$inst_name] = sizeof($insts_ids);
      array_push($insts, $inst);
    }
    return $insts_ids[$inst_name];
  }

  function value_date($date){
    $_date = (string) $date->attributes()['ansi'];
    return empty($_date) ? "NULL" : $_date;
  }

  function value_or_NULL($value){
    return empty($value) ? "NULL" : $value;
  }

?>
