<?php
header('Content-Type: text/html; charset=utf-8');
ob_start();
$dir = $_POST['title'].$_POST['m1_id'].$_POST['m2_id'].$_POST['m3_id'];
mkdir("uploads/".$dir, 0777);

echo "<h1>Resultado da Submissão:</h1>";
foreach ($_POST as &$value) {
    echo $value."<br/>";
}
echo "<h1>Resultado do upload dos ficheiros:</h1>";
for ($i=0; $i < count($_FILES["file"]["name"]) ; $i++) {   
  if ($_FILES["file"]["error"][$i] > 0)
    {
    echo "Erro: " . $_FILES["file"]["error"][$i] . "<br>";
    }
  else
    {
    if (file_exists("uploads/".$dir."/". $_FILES["file"]["name"][$i]))
      {
      echo $_FILES["file"]["name"][$i] . " já existe.<br/> ";
      }
    else
      {
      move_uploaded_file($_FILES["file"]["tmp_name"][$i],
      "uploads/".$dir."/" . $_FILES["file"]["name"][$i]);
      echo "<br/>Ficheiro guardado: " . "uploads/" .$dir."/". $_FILES["file"]["name"][$i];
      }
    }
}



$files = scandir("uploads/".$dir."/");
echo "<br/><h1>Ficheiros na directoria:</h1>";
foreach ($files as &$value) {
    echo $value."<br/>";
}


file_put_contents('uploads/'.$dir.'/index.html', ob_get_contents());

?>