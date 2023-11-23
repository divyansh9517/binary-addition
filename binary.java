import java.util.*;
class binary
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" input the 1st binary number : - ");
        int b1=sc.nextInt();
        System.out.println("input the 2end binary number : - ");
        int b2=sc.nextInt();
        int i=0,rem=0;
        int[] sum=new int[20];
        while(b1 != 0 || b2 != 0)
        {
            sum[i++]=(int)(((b1%10)+(b2%10)+rem)%2);
            rem=(int)(((b1%10)+(b2%10)+rem)/2);
            b1=b1/10;
            b2=b2/10;
        }
        if(rem!=0)
        {
            sum[i++]=rem;
        }
        --i;
        System.out.print("Sum of two binary numbers: ");
        while(i >= 0 )
        {
            System.out.print(sum[i--]);
        }
        System.out.println();
    }
}