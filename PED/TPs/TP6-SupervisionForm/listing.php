<?php

function readSup (){ 
  $supervisions = simplexml_load_file('supervisions.xml');

  foreach($supervisions->children() as $sup)
  {
    echo "<p>Supervision: ".$sup['type']." ".$sup['status'] ;
    echo "<p>Name: ".$sup->student->name;
    echo "  ->  ID: ".$sup->student->id."</p>";
    echo "<p>Course: ".$sup->student->course."</p>";
    echo "<p>Co-supervisor: ".$sup->{'co-sup'}->name." - ".$sup->{'co-sup'}->instituition."</p>";
    echo "<p>".$sup->bdate." - ".$sup->edate."</p>";
    echo "<hr/>";
  }
} 

?>
