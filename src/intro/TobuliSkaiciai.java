package intro;

public class TobuliSkaiciai {


    public static void main(String[] args) {

    int num, i, sum=0, total=0;
            System.out.println("PERFECT NUMBERS : ");
            for(num=1; num<=1000; num++)
    {
        sum=0;
        for(i=1; i<=num; i++)
        {
            if(num%i==0)
                sum=sum+i;
        }

        //System.out.println("Sum : "+sum + " " + num);
        if(num*2==sum)
        {
            System.out.println(num);
            sum=0;
            total++;
        }
    }
            System.out.println("Total : "+total);
}
}
