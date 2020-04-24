
public class BooleanExample{
	public static void main(String[] args){
		boolean isTrue = false; //true
		
		int num1, num2;
		num1=19;
		num2=29;
		//int result=num1-num2;
		
		isTrue = (num1-num2>=0);
		
		if(isTrue){
			System.out.println("Num1 is larger");
		} else {
			System.out.println("Num2 is larger");
		}
	}
}