
public class ForSumExample {
    public static void main(String[] args){
        //1...100까지 합을 구하는 프로그램
        int answer=0;
        for(int i=1;i<=100;i++){
            answer = answer+i;
        }
        System.out.println(answer);
        answer = 0;
        for(int i=0;i<=100;i++){
            if(i%3==0){
                answer=answer + i;
            }
        }
        System.out.println(answer);
        //3의 배수만 구하는 프로그램
        // for(int i=1;i<=100;i++){
        //     if(i%3==0){
        //         System.out.println(i+"은(는) 3의 배수입니다.");
        //     }
        //}
    }
}