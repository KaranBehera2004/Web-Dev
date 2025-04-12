let h1=document.getElementById('h1');
let c=0;
function add()
{
    c++;
    h1.textContent=c;
}
function sub()
{
    if(c>0)
    {
        c--;
        h1.textContent=c;
    }
    else
    {
        alert("Negetive values are not allowed !!! ");
    }
    
}
function reset()
{
    c=0;
    h1.textContent=c;
}