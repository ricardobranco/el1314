<?php 
$count = $_POST['supcount'];
$filename = "supervisions".time().".xml";
file_put_contents($filename, '<?xml version="1.0" encoding="UTF-8"?><supervisions/>');


$supervisions = simplexml_load_file($filename);

for ($i=1; $i <= $count; $i++) {
  $supervision = $supervisions->addChild('supervision');

  $student = $supervision->addChild('student');
  $student->addChild('name',  $_POST['name'.$i] );
  $student->addChild('id',  $_POST['id'.$i]);

  $course = $supervision->addChild('course');
  $course->addChild('desc',   $_POST['desc'.$i]);
  $course->addChild('inst',   $_POST['inst'.$i]);

  $document = $supervision->addChild('document');
  $document->addChild('title',   $_POST['title'.$i]);
  $document->addChild('thesis',   $_POST['thesis'.$i]);
  $document->addChild('workplan',   $_POST['workplan'.$i]);


  $cosup = $supervision->addChild('co-sup');
  $name = $cosup->addChild('s_name',  $_POST['s_name'.$i]);
  $instituition = $cosup->addChild('s_inst',  $_POST['s_inst'.$i]);


  $bdate = $supervision->addChild('bdate',  $_POST['bdate'.$i]);
  $edate = $supervision->addChild('edate',  $_POST['edate'.$i]);
}


$dom = new DOMDocument('1.0', 'utf-8');
$dom->preserveWhiteSpace = false;
$dom->formatOutput = true;
$dom->loadXML($supervisions->asXML());
$dom->save($filename);

header("Location: ".$filename);
?>
