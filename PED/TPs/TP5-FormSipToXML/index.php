<!DOCTYPE html>
<html>
<head>
<title>Formulário de submissão de SIP</title>
<link rel="stylesheet" type="text/css" href="assets/style.css">
<link rel="stylesheet" type="text/css" href="assets/custom.css">
<script type="text/javascript" src="assets/jquery.js"></script>
<script type="text/javascript" src="assets/functions.js"></script>
</head>
<body>
<div class="newsubmit">
<a href="form.html"><button style="margin-top: 30px;width:90%;" class="pure-button pure-input-1 pure-button-primary">Fazer nova entrega</button></a>
</div>
<div class="dir"><h1>Trabalhos submetidos</h1>
<?php
if ($handle = opendir('uploads')) {
    while (false !== ($entry = readdir($handle))) {
        if ($entry != "." && $entry != ".." && $entry != ".DS_Store") {
            echo "<a href='uploads/$entry'>$entry</a> | ";
        }
    }
    closedir($handle);
}
?>
</div>



</body>
</html>