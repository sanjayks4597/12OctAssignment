
public class ChangeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="hello";
		String str2="world";
		System.out.println("initially.....");
		System.out.println("String 1:"+str1);
		System.out.println("String 2:"+str2);
		
		str1=str1.concat(" "+str2);
		str2=str1;
		
		str1=str1.replace("hello", "");
		str2=str2.replace("world", "");
		
		str1=str1.trim();
		str2=str2.trim();
		System.out.println("finally.....");
		System.out.println("String 1:"+str1);
		System.out.println("String 2:"+str2);

	}

}
