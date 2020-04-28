
public class ForExample {
    public static void main(String[] args) {
        int sum = 0;
        sum = sum + 1;//1
        sum = sum + 2;//3
        sum = sum + 3;//6
        sum = sum + 4;//10
        sum = sum + 5;//15

        sum = 0;

        // for(int i=1; i<=5; i++){
        //     sum = sum + i;
        //     System.out.println(sum + ", " + i);
        // }
        // System.out.println("sum: " + sum);
        // System.out.println(2 + " * " + 1 + " = " + (2*1));
        // System.out.println(2 + " * " + 2 + " = " + (2*2));
        // System.out.println(2 + " * " + 3 + " = " + (2*3));

        // for(int j=1; j<=9; j++){
        //     System.out.println(2 + " * " + j + " = " + (2*j));
        // }

        for (int i=1; i<=10; i++){
            for(int j=10-i; j>=1; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        
    }

}