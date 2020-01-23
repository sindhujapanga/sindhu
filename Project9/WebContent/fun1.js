/**
 * 
 */
function fun1()
{
	var gender="";
	var a=document.registration.id.value;
	
	var b=document.registration.pass.value;
	var c=document.registration.username.value;
	
	var d=document.getElementsByName("x");
	if(d[0].checked==true)
		gender="male";
	else if(d[1].checked==true)
		gender="female";
	else
		gender="other";
	var e=document.registration.email.value;
	var f=document.registration.address.value;
	var g=document.registration.country.value;
	var h=document.registration.code.value;
	var i=document.registration.language.value;
	var j=document.registration.about.value;
	alert("hello how are you"+a+" "+b+" "+c+" "+gender+" "+e+" "+f+" "+g+" "+h+" "+i+" "+j);
}