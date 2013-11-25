var cosupcount = 0;

function addCoSup() {
    if (cosupcount == 0) {
        var newSup = '<div class="pure-g-r" id="cosup"><div class="pure-u-1-3"><label for="cosupname">Name</label><input name="cosupname" required type="text"></div><div class="pure-u-1-3"><label for="cosup_inst">Instituition</label><input name="cosup_inst" required type="text"></div></div>' ;
        $('#supervisors').append(newSup);
        cosupcount++;
    }
    else {
        alert('Already has one Co-supervisor');
    } 
}

function rmCoSup() {
    if (cosupcount ==1 ) {
        cosupcount--;
        var sup = document.getElementById('cosup');
    	sup.parentNode.removeChild(sup);
    }
}

$(document).ready(function(){
    $('#addCoSup').click(addCoSup)
});

$(document).ready(function(){
    $('#rmCoSup').click(rmCoSup)
});
