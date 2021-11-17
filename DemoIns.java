package text3_1;

import java.util.Scanner;

public class DemoIns {
    public static void main(String[] Demo){

        Scanner sc = new Scanner(System.in);
        Instruments Ins = new Instruments();

        while(true) {

            Ins.print_str("选择要实现的功能：");
            Ins.print_str("1. 打印字符串");
            Ins.print_str("2. 将字符串中大写字母全部转换为小写");
            Ins.print_str("3. 计算加法结果并打印");
            Ins.print_str("4. 计算圆的面积并打印");
            Ins.print_str("5. 打印出一个矩阵");
            Ins.print_str("6. 退出");

            int i = sc.nextInt();
            switch (i) {
                //打印字符串
                case 1 -> Ins.print_str("Artoria");

                //将字符串中大写字母全部转换为小写
                case 2 -> Ins.print_str(Ins.toCapital("ArtoRIA"));

                //计算加法结果并打印
                case 3 -> Ins.add(1, 1);

                //计算圆的面积并打印
                case 4 -> Ins.circle_area(10);

                //打印出一个矩阵
                case 5 -> Ins.matrix();

            }
            if(i == 6) break;
        }
    }
}
