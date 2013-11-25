<?php include 'listing.php' ?>
<!DOCTYPE html>
<html>
<head>
  <title>Supervision Form</title>
  <link href="assets/style.css" rel="stylesheet" type="text/css">
  <link href="assets/custom.css" rel="stylesheet" type="text/css">
  <script src="assets/jquery.js" type="text/javascript"></script>
  <script src="assets/functions.js" type="text/javascript"></script>
</head>

<body>
  <section class="main-wrapper">
    <form action="supervision.php" class="pure-form pure-form-stacked" enctype=
    "multipart/form-data" method="post">
      <fieldset>
        <legend>Supervision</legend>

        <div class="pure-g-r">
          <div class="pure-u-1-3">
            <label for="status">Status</label> <input name="status" required=""
            type="text">
          </div>

          <div class="pure-u-1-3">
            <label for="type">Type</label> <input name="type" required="" type=
            "text">
          </div>

          <div class="pure-u-1-3">
            <label for="bdate">Begin date</label> <input name="bdate" required=
            "" type="text">
          </div>

          <div class="pure-u-1-3">
            <label for="edate">End Date</label> <input name="edate" type=
            "text">
          </div>
        </div>
      </fieldset>

      <fieldset>
        <legend>Student</legend>

        <div class="pure-g-r">
          <div class="pure-u-1-3">
            <label for="name">Name</label> <input name="name" required="" type=
            "text">
          </div>

          <div class="pure-u-1-3">
            <label for="id">ID</label> <input name="id" required="" type=
            "text">
          </div>

          <div class="pure-u-1-3">
            <label for="course">Course</label> <input name="course" required=""
            type="text">
          </div>
        </div>
      </fieldset>

      <fieldset id="supervisors">
        <legend>Co-supervisor <span class="btn-inside"><a class=
        "pure-button pure-button-success pure-button-xsmall" id=
        "addCoSup">+</a> <a class=
        "pure-button pure-button-error pure-button-xsmall" id=
        "rmCoSup">-</a></span></legend>

        <div class="pure-g-r"></div>
      </fieldset><button class="pure-button pure-input-1 pure-button-primary"
      style="margin-top: 30px;" type="submit">Submit</button>
    </form>
  </section>

  <section class="main-wrapper">
    <?php readSup(); ?>
  </section>
</body>
</html>
