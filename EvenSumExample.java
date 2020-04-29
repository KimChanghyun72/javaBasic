
public class EvenSumExample {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1; i<=100; i++){             //다음 단락을 실행하지 않고 넘어가서 처음으로 돌아감.
            //2 또는 3의 배수를 출력하시오.
            if(i%2==0){
                System.out.println("2의 배수"+i);
            } else if(i%3==0) {
                System.out.println("3의 배수" + i);
            } else {
                continue;
            }
            
        }
        //System.out.println("sum :  "+ sum);

        for(int i=1; i<=100; i++){      //2의 배수 혹은 3의 배수 출력
            if((i%2==0)||(i%3==0)){
                System.out.println(i);
            }
        }
        for(int i=1; i<=100; i++){      //2의 배수인 동시에 3의 배수인 숫자 출력(6의 배수)
            if((i%2==0)&&(i%3==0)){
                System.out.println(i);
            }
            if( !( i % 2 == 0)){
                System.out.println("홀수값 : " + i);
            }
        }
        
        
    }
}   