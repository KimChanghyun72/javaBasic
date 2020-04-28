
public class IfExample {
 public static void main(String[] args){
     int score = 95;
     score = 87;
     if(score>=90){
        System.out.println("점수가 90점 이상입니다.");
        if(score>=95){
             System.out.println("A+ 입니다.");
         }else{
                System.out.println("A 입니다.");
         }
        
        }else if (score>=80){
            System.out.println("점수가 80점 이상입니다.");
            if(score>=85){
                System.out.println("점수가 B+ 입니다.");
            } else{
                System.out.println("B 입니다.");    
            }
        } else if (score >=70){
            System.out.println("점수가 70점 이상입니다.");
            System.out.println("C 입니다.");
        
        } else {
         System.out.println("점수가 90점 이하입니다.");

     }
     System.out.println("end of program.");
 }
}