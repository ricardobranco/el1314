<?php 

if (!file_exists("supervisions.xml")) {
    file_put_contents("supervisions.xml", '<?xml version="1.0" encoding="UTF-8"?><supervisions/>');
}

$supervisions = simplexml_load_file('supervisions.xml');


$supervision = $supervisions->addChild('supervision');
$supervision->addAttribute('type', iconv('ISO-8859-1', 'UTF-8',$_POST['type']));
$supervision->addAttribute('status', iconv('ISO-8859-1', 'UTF-8',$_POST['status']));


$student = $supervision->addChild('student');
$name = $student->addChild('name', iconv('ISO-8859-1', 'UTF-8',$_POST['name'] ));
$id = $student->addChild('id', iconv('ISO-8859-1', 'UTF-8',$_POST['id']));
$course = $student->addChild('course', iconv('ISO-8859-1', 'UTF-8', $_POST['course']));


if (isset($_POST['cosupname'])) {
  $cosup = $supervision->addChild('co-sup');
  $name = $cosup->addChild('name', iconv('ISO-8859-1', 'UTF-8',$_POST['cosupname']));
  $instituition = $cosup->addChild('instituition', iconv('ISO-8859-1', 'UTF-8',$_POST['cosup_inst']));
} 

$bdate = $supervision->addChild('bdate', iconv('ISO-8859-1', 'UTF-8',$_POST['bdate']));
if($_POST['edate']!=null){
  $edate = $supervision->addChild('edate', iconv('ISO-8859-1', 'UTF-8',$_POST['edate']));
} 



$dom = new DOMDocument('1.0', 'utf-8');
$dom->preserveWhiteSpace = false;
$dom->formatOutput = true;
$dom->loadXML($supervisions->asXML());
$dom->save("supervisions.xml");

header("Location: index.php");
?>
