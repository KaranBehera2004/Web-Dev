const para=document.getElementById('para');
let c=10;
// console.log(c);
// setTimeout(function()
// {
//     para.textContent="Hello";
//     c++;
// },5000);
// console.log("Helo world");
let min=setInterval(function()
{
    para.textContent=c;
    if(c==1)
    {
        clearInterval(min);
    }
    c--;
},1000)
let timer=setInterval(function()
{
    para.textContent=c;
    if(c==1)
    {
        clearInterval(timer);
    }
    c--;
},1000);