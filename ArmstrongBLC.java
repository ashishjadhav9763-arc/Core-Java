
public class ArmstrongBLC {
	
	public boolean isArmstrong(int num)
	{ 
		int temp = num;
		int count = 0;
		
		while(num != 0)
		{
			count++;
			num = num / 10;			
		}
		
		num = temp;
		double sum = 0;
		while(num != 0)
		{
			int last = num % 10;
			sum = sum + Math.pow(last, count);
			num = num / 10;			
		}
		
		if(temp == sum)
		{
			return true; 
		}
		else
		{
			return false;
		}
	}

}