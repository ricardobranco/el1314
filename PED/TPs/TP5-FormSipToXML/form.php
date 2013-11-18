<?php


$filecount = 0;

$dir = $_POST['keyname'].$_POST['m1_id'].$_POST['m2_id'].$_POST['m3_id'];
mkdir("uploads/".$dir, 0777);

for ($i=0; $i < count($_FILES["file"]["name"]) ; $i++) {   
  move_uploaded_file($_FILES["file"]["tmp_name"][$i],"uploads/".$dir."/" . $_FILES["file"]["name"][$i]);
}

// XML

$xml = new SimpleXMLElement('<?xml version="1.0" encoding="UTF-8"?><sip/>');
$meta = $xml->addChild('meta');
$abstract = $xml->addChild('abstract', $_POST['abstract']  );
$files = $xml->addChild('files');

// Meta

$keyname = $meta->addChild('keyname', $_POST['keyname']);
$title = $meta->addChild('title', $_POST['title']);
$subtitle = $meta->addChild('subtitle', $_POST['subtitle']);
$course = $meta->addChild('course', $_POST['course']);
$class = $meta->addChild('class', $_POST['class']);
$sdate = $meta->addChild('sdate', $_POST['sdate']);
$edate = $meta->addChild('edate', $_POST['edate']);

$supervisors = $meta->addChild('supervisors');
$workteam = $meta->addChild('workteam');

// Supersivors

for ($i=1; $i <= $_POST['supcount'] ; $i++) { 
  $supervisor = $supervisors->addChild('supervisor');

  $name = $supervisor->addChild('name', $_POST["s".$i."_name"]);
  $email = $supervisor->addChild('email', $_POST["s".$i."_email"]);
  $webapage = $supervisor->addChild('webpage', $_POST["s".$i."_webpage"]);
}

for ($i=1; $i <= $_POST['memcount'] ; $i++) { 
  $member = $workteam->addChild('member');

  $name = $member->addChild('name', $_POST["m".$i."_name"]);
  $id = $member->addChild('id', $_POST["m".$i."_id"]);
  $email = $member->addChild('email', $_POST["m".$i."_email"]);
  $webapage = $member->addChild('webpage', $_POST["m".$i."_webpage"]);
  $photo = $member->addChild('photo', $_FILES["file"]["name"][$filecount]);
  $filecount++;
}


for ($i=1; $i <= $_POST['filecount'] ; $i++) { 
  $file = $files->addChild('file', $_POST['f'.$i.'_name']);
  $file->addAttribute('path', $_FILES["file"]["name"][$filecount]);
  $file->addAttribute('format',pathinfo($_FILES["file"]["name"][$filecount], PATHINFO_EXTENSION));
  $filecount++;
}


$dom = new DOMDocument('1.0');
$dom->preserveWhiteSpace = false;
$dom->formatOutput = true;
$dom->loadXML($xml->asXML());
$dom->save("uploads/".$dir."/SIP.xml");

$xsl = new DOMDocument('1.0');
$xsl->load('SIP.xsl');

$proc = new XSLTProcessor;
$proc->importStyleSheet($xsl); // attach the xsl rules

file_put_contents("uploads/".$dir."/index.html", $proc->transformToXML($xml));
header("Location: "."uploads/".$dir."/index.html");
die();

?>