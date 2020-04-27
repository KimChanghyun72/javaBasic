
public class LongExample {
	public static void main(String[] args){
		long num1=100;
		long num2=20L;
		//long num3=1000000000000;  //compile error
		//long var4=1000000000000L;
		
		int num4=Integer.MAX_VALUE;
		int num5=15504;
		num4=21474;
		if (num4 <= Integer.MAX_VALUE - num5) {
		int result = num4 + num5;
		System.out.println("result: " + result);
		} else {
			System.out.println("overflow maxvalue");
		}
		int num6, num7;
		num6 = Integer.MAX_VALUE;
		num7 = 152;
		
		if (num6 <= Integer.MAX_VALUE/num7){   //nice way!
			System.out.println(num6*num7);
		} else {
			System.out.println("overflow maxvalue");
		}
				
			
			
		//System.out.println(num1);
		//System.out.println(num2);
	}
}