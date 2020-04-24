
public class CharExample {
	public static void main(String[] args) {
		char c1 = 97;
		int int1;
		
		for(int i=0; i<26; i++){
			int1=c1++;
		/*System.out.println("int1 : " + int1 + ", cl : " + c1);
			c1++;*/
		//(char)(int1)->강제형변환//
		System.out.println("int1 : " + (char)(int1) + ", c1 : " + (char)(c1-1));
		}
		
	}
}
