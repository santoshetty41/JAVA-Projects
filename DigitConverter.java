import java.util.Scanner;

class DigitConverter
{
	public static void main(String[] args)
	{
			
		String[] sd1 = {"zero","one","two","three","four","five","six","seven",
						"eight","nine","ten","eleven","twelve","thirteen","fourteen",
						"fifteen", "sixteen", "seventeen","eighteen","nineteen"};
			
		String[] sd2 = {"","","twenty","thirty","fourty","fivety","sixty","seventy"
						,"eighty","ninety","hundred"};
		
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		if(n < 20)
		{
			for(int i = 0; i < 20; i++)
			{
				if(i == n)
				{
					System.out.println(sd1[i]);
				}
				
			}
		}
		else if(n % 10 == 0)
		{
			for(int i = 0; i <= 100; i++)
			{
				int r = n/10;
				System.out.println(sd2[r]);		
				break;
			}
			
		}
		else
		{
			for(int i = 0; i <= 100; i++)
			{
				int firstNo = n/10;
				int lastNo = n%10;
							
				System.out.println(sd1[firstNo]+" "+sd1[lastNo]);
				break;
			}
		}
		
	}
	
}