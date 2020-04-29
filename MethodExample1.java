import javax.sound.sampled.SourceDataLine;

public class MethodExample1 {
    public static void main(String[] args) {
        
        printTriangle(7);
        //printGugudan(8);
        //printStar(5, "qnpnqnpnqnpnp");
        //printString("Good Morning!","Kim!");

        //pyramid(5);
        //printDouble(80, 5);
        //printDouble(80);
        // int result = sum(10, 20);
        // System.out.println("result: " + result);
        
        // int result2 = TripleSum(10,20,30);
        // System.out.println(result2);

        //System.out.println("1부터 10까지의 합 : " + toSum(1,10));
        //PointStar(3,5);
        //System.out.println();
        //printStar(5);
    }

    public static void printGugudan(int dan){
        for(int i=1; i<=9; i++){
            System.out.println(dan + " * " + i + " = " + dan*i);
        }
    }

    public static int sum(int a, int b){
        return a+b;
    }
    //받는 변수가 다른 타입이라면 ex)int vs double 같은 이름의 메소드라도 만들 수 있다.
    //메소드는 매개값의 갯수와 타입으로 구분짓는다. 같은 이름의 메소드는 만들 수 있다.
    
    public static int TripleSum(int a, int b, int c){
        int sum = a+b+c;
        return sum;
    }

    public static int toSum(int num1, int num2){
        int sum=0;
        for(int i=num1; i<=num2; i++){
            sum += i; 
        }
        return sum;
    }

    //별표를 찍는 메소드. 매개값 2개. 
    public static void PointStar(int num1, int num2){

        for(int i= num1; i<=num2; i++){
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        return;
    }
    public static void printStar(int a, String b){
        for (int i=1; i<=a; i++){
            System.out.println(b+b);
        }
    }

    public static void printDouble(int a){
        System.out.println(2*a);
        return;
    }

    public static void printDouble(int a, int b){
        System.out.println("결과값은 : " + a*b);
        return;
    }

    public static void printString(String str, String name){
        System.out.println(str + ", " + name);
    }

    public static void printTriangle(int num){

        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                
                if(j <= i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void pyramid(int input) {

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input + i - 1; j++) {
                if (j >= input - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
        }
    }


}