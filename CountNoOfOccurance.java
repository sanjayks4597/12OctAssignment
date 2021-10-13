
public class CountNoOfOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Tit for tat is a proverb";
		str=str.toLowerCase();
		int tCount =0;
		int fCount=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				if(str.charAt(i)=='t')
				{
					tCount++;
				}
				else if(str.charAt(i)=='f')
				{
					fCount++;
				}
			}
		}
		
			System.out.println("t Count is :"+tCount);
			System.out.println("f Count is :"+fCount);
		
	}

}
