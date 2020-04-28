
public class WhileExample {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i<=5;i++){
            sum = sum + 1;
        }
        int i = 1;
        while(i <= 5){
            sum = sum + i;
            i++;
        }

        //while..
        i = 1;
        sum = 0;

        // while(true){
        //     sum = sum + i;
        //     if(i>5){
        //     break;
        //     }
        //     i++;
        // }
        //end of statement...
        i = 1;
        sum = 0;
        int j=1;

        // while(i<=30){
        //     if(i%2 != 0){
        //         sum = sum + i;
        //         j = i;
        //          System.out.println(sum);
        //          System.out.println(j);
        //     }
        //     i++;
       
      
        // }
        i=1;
        sum=0;
        while(true){
            if(i>100)
            break;

            if(i%2 != 0){
                sum = sum + i;
                System.out.println(sum);
            }
            i++;
           
        }
        
    }
}