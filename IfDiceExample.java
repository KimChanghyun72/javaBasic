
public class IfDiceExample {
    public static void main(String[] args) {
        for (int j = 1; j <= 8; j++) {
            for (int i = 1; i <= 6; i++) {
                int num = (int) (Math.random() * 45) + 1;
                System.out.print(num + " ");
            }
            System.out.println(); // 35 3 29 15 38 28
        }

        // if(num==1){
        // System.out.println("1번이 나왔습니다.");
        // } else if(num==2){
        // System.out.println("2번이 나왔습니다.");
        // } else if(num==3){
        // System.out.println("3번이 나왔습니다.");
        // } else if(num==4){
        // System.out.println("4번이 나왔습니다.");
        // } else if(num==5){
        // System.out.println("5번이 나왔습니다.");
        // } else {
        // System.out.println("6번이 나왔습니다.");
        // }
    }
}