
public class ForRemind2 {
    public static void main(String[] args) {
        
        //2 또는 3의 배수-->2,3,4,6,8,9,....
        for (int i=1; i<=20; i++){
            if((i % 2 == 0) || (i % 3 == 0)) {
                System.out.println( i + " 는 2 또는 3의 배수입니다.");
            }
        }

        for (int i = 1 ; i<=20; i++) {
            if((i % 2 == 0) && (i % 3 == 0)){
                System.out.println(i + " 는 2의 배수이자 3의 배수인 숫자입니다.");
            }
        }

        //2의 배수이면서 3의 배수

    }
}