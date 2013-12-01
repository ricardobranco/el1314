var supcount = 1;

function addSupervision() {
    supcount++;
    $('#supcount').val(supcount);
    var newSup = '<br/><fieldset id="supervision'+supcount+'"><legend>Supervision</legend><fieldset><legend>student</legend> name<input name="name'+supcount+'" type="text">id<input name="id'+supcount+'" type="text"><fieldset><legend>course</legend> desc<input name="desc'+supcount+'" type="text">inst<input name="inst'+supcount+'" type="text"></fieldset></fieldset><fieldset><legend>document</legend> title<input name="title'+supcount+'" type="text">workplan<input name="workplan'+supcount+'" type="text"> thesis<input name="thesis'+supcount+'" type="text"></fieldset><fieldset><legend>co-sup</legend> name<input name="s_name'+supcount+'" type="text">inst<input name="s_inst'+supcount+'" type="text"></fieldset>bdate<input name="bdate'+supcount+'" type="text"> edate<input name="edate'+supcount+'" type="text"><br></fieldset>';
    $('#supervision'+(supcount-1)).after(newSup);

}


function rmSupervision() {
  if (supcount>1){
    var sup = document.getElementById('supervision'+supcount);
    sup.parentNode.removeChild(sup);
    supcount--;
    $('#supcount').val(supcount);
  }
}


$(document).ready(function(){
    $('#addSupervision').click(addSupervision)
});

$(document).ready(function(){
    $('#rmSupervision').click(rmSupervision)
});