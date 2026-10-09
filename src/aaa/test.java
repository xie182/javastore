package aaa;


import java.util.Scanner;

public class test {
    static void main() {
        /*彩票中奖案例，生成一个7位的随机数表示彩票号码，键盘录入一个7位数表示用户购买的彩票号码，判断用户是否中奖。
    中奖规则：彩票号码和用户购买的号码相同，无论顺序如何，只要包含相同的数字且个数相同即为中奖。
    例如：彩票号码为1234567，用户购买的号码为7654321，则为中奖。
    */
        //生成一个7位的随机数
        int lotteryNumber = (int) (Math.random() * 9000000 + 1000000);

        //键盘录入一个7位数
        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();

        //判断用户输入的数字是否和系统生成的数字一致
        if (lotteryNumber == userNumber) {
            System.out.println("恭喜你，中奖了！");
        } else {
            System.out.println("很遗憾，未中奖。");
        }

    }
}