var supcount = 1;
var memcount = 1;
var filecount = 1;

function addSupervisor() {
    supcount++;
    $('#supcount').val(supcount);
    var newSup = '<div class="pure-g-r" id="s'+supcount+'"><div class="pure-u-1-3"><label for="name">Name</label><input name="s'+supcount+'_name" type="text" required></div><div class="pure-u-1-3"><label for="email">Email</label><input id="email" name="s'+supcount+'_email" type="text" required></div><div class="pure-u-1-3"><label for="webpage">Webpage</label><input name="s'+supcount+'_webpage" type="text" placeholder="optional"></div></div' ;
    $('#supervisors').append(newSup);
}

function rmSupervisor() {
    var sup = document.getElementById('s'+supcount);
	sup.parentNode.removeChild(sup);
	supcount--;
    $('#supcount').val(supcount);
}

function addMember () {
	memcount++;
    $('#memcount').val(memcount);
    var newMem = '<div class="pure-g-r" id="m'+memcount+'"><div class="pure-u-1-3"><label for="name">Name</label><input name="m'+memcount+'_name" type="text" required></div><div class="pure-u-1-3"><label for="id">Id</label><input name="m'+memcount+'_id" type="text" required></div><div class="pure-u-1-3"><label for="email">Email</label><input name="m'+memcount+'_email" type="text" required></div><div class="pure-u-1-3"><label for="webpage">Webpage</label><input name="m'+memcount+'_webpage" type="text" placeholder="optional"></div><div class="pure-u-1-3"><label for="photo">Fotografia</label><input type="file" name="file[]"></div></div>';
       $('#workteam').append(newMem);
}

function rmMember() {
    var mem = document.getElementById('m'+memcount);
	mem.parentNode.removeChild(mem);
	memcount--;
    $('#memcount').val(memcount);
}

function addFile () {
	filecount++;
    $('#filecount').val(filecount);
    var newFile = '<div class="pure-g-r" id="f'+filecount+'"><div class="pure-u-1-2"><label for="name">Name</label><input name="f'+filecount+'_name" type="text" required></div><div class="pure-u-1-2"><label for="file">Ficheiro</label><input type="file" name="file[]"></div></div>';
           $('#files').append(newFile);
}

function rmFile() {
    var file = document.getElementById('f'+filecount);
	file.parentNode.removeChild(file);
	filecount--;
    $('#filecount').val(filecount);
}

$(document).ready(function(){
    $('#addSupervisor').click(addSupervisor)
});

$(document).ready(function(){
    $('#rmSupervisor').click(rmSupervisor)
});

$(document).ready(function(){
    $('#addMember').click(addMember)
});

$(document).ready(function(){
    $('#rmMember').click(rmMember)
});

$(document).ready(function(){
    $('#addFile').click(addFile)
});

$(document).ready(function(){
    $('#rmFile').click(rmFile)
});

