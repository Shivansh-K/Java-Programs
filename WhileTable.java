import java.util.Scanner;
class WhileTable 
    {
        public static void main(String[] args) 
        {
        Scanner KB=new Scanner(System.in);
    	System.out.print("Enter number:");        
        int n=KB.nextInt();
        int i=1;
        while(i<=10)
        {
            System.out.println(n+" * "+i+" = "+n*i);
            i++;
        }

        }

    }