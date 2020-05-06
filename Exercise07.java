import java.util.Scanner;

import jdk.nashorn.internal.ir.BreakableNode;

public class Exercise07 {
    public static void main(String[] args) {

        boolean run = true;

        int balance = 0;

        Scanner scn = new Scanner(System.in);
        while (run) {
            System.out.println("---------------------");
            System.out.println("1.예금|2.출금|3.잔고|4.종료");
            System.out.println("---------------------");
            System.out.println("선택> ");
            int menu = scn.nextInt();
            // 엔터를 넣어주는 값 뒤에는 반드시 scn.nextLine();를 넣어줘야해.
           if(menu==1){
               System.out.println("예금 선택.");
               balance += scn.nextInt();
           } else if(menu==2){
                System.out.println("출금 선택");
                balance -= scn.nextInt();
           } else if(menu==3){
               System.out.println("잔고 선택");
               System.out.println("현잔고는" + balance + "입니다.");
           } else {
               System.out.println("종료 선택");
               run = false;
           }

        }

        System.out.println("end of program.");
    }
}