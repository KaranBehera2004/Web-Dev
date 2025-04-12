let n=456;
function find(_x)
{
    let sum=0,sum2=0,rem2,rem;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        while(sum>0)
        {
            if(sum>=10||sum>0)
            {
                rem2=sum%10;
                sum2=sum2+rem2;
                sum=sum/10;
            }
        }
        console.log(sum2);
}
find(n);