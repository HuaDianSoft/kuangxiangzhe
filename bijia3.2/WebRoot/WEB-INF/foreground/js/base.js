// JavaScript Document
function ready(){
	i = 0; 
	window.setInterval("change()",50);
}

function change(){
	var str = document.getElementById("top-word");
	if(i<320){
		i = i+2;
		str.style.marginLeft = i+"px";
		
	}else{
		i = 0;
		str.style.marginLeft = i+"px";
	}
		
}
function emptyvalue(){
	var str = document.getElementById("kw");
	if(str.value=="输入书名，作者，出版社或者ISBN"){
		str.value="";
	}
}
function initvalue(){
	var str = document.getElementById("kw");
	if(str.value.length<1){
		str.value="输入书名，作者，出版社或者ISBN";
	}
}
function emptyvalue2(){
	var str = document.getElementById("word");
	if(str.value=="输入书名，作者，出版社或者ISBN"){
		str.value="";
	}
}
function initvalue2(){
	var str = document.getElementById("word");
	if(str.value.length<1){
		str.value="输入书名，作者，出版社或者ISBN";
	}
}



$jquery(function() {
    var availableTags = [
      "我的西游记",
      "水浒传",
	  "三国演义",
	  "西游记"
    ];
    $( "#word" ).autocomplete({
      source: availableTags
    });
 });