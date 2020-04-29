
public class ForAndForExample {
    public static void main(String[] args) {
        // for(int i=1; i<=5; i++){
        //     System.out.println("i의 값: " + i);
        //     for(int j=1; j<=3; j++){
        //         System.out.println("   j의 값: " + j);
        //     }
        // }

        for(int i=2; i<=9; i++){
            System.out.println(i + "단");
            for(int j=1; j<=9; j++){
                System.out.println(i +" * " + j + " = " + (i*j));
            }
        }


    }
}