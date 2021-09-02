import java.util.Scanner;
public class JAVACALCULATOR {
    
    public static void main(String[] args) 
	{
		int n1=0;
		int n2=0;
		boolean flag;
    
		do
    	{
      		try
				{
					Scanner input=new Scanner(System.in);
					System.out.println("Enter 2 integers ");
					n1=input.nextInt();
					n2=input.nextInt();
					flag=false;
				}
			catch(Exception invalidinput)
      		{
        		System.out.println("Invalid input.."+invalidinput);
        		flag=true;
      		}
        }
    while(flag);
    System.out.println("Enterred:  "+n1+n2);

		System.out.println("Choose operation:");
		System.out.println("1-ADD");
		System.out.println("2-SUBTRACT");
		System.out.println("3-MULTIPLY");
		System.out.println("4-DIVIDE");
		Scanner operation = new Scanner(System.in);
		int operate=operation.nextInt();

		switch (operate) 
		{
  		case 1:
    	float resultadd=n1+n2;
		System.out.println(+resultadd);
    	break;
  		case 2:
    	float resultsub=n1-n2;
		System.out.println(+resultsub);
    	break;	
  		case 3:
    	float resultprod=n1 * n2;
		System.out.println(+resultprod);
    	break;	
  		case 4:
    	DIVIDE(n1,n2);
    	break;
			default:
			System.out.println("RE-ENTER");
			operate=operation.nextInt();
		}
public static void DIVIDE(int n1,int n2)
	{
		if(n2!=0)
		System.out.println(n1/n2);
		else {
		
		}	
		try{
			System.out.println(n1/n2);
		}
		catch(Exception division)
			{
				System.out.println("Arithmetic Exception,can't divide by zero");
			}
		}
   }//loop

