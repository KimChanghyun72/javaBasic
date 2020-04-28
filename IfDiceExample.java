
public class IfDiceExample {
    public static void main(String[] args) {
        
        for(int i=1;i<=6;i++){
            int num = (int)(Math.random()*45) + 1;
            System.out.println(num);
        }
        

        // if(num==1){
        //     Ssystem.out.println("1번이 나왔습니다.");
        // }
    }
}