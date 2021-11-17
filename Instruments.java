package text3_1;

import java.util.Scanner;
public class Instruments extends Abstract_Instruments{

    //打印字符串
    public void print_str(String s){
        System.out.println(s);
    }

    //将字符串中大写字母全部转换为小写
    public String toCapital(String s){
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) <= 90 && s.charAt(i) >= 65){
                StringBuilder sb = new StringBuilder(s);
                //将大写字母转换
                char ch = Character.toLowerCase(s.charAt(i));
                String a = Character.toString(ch);
                sb.replace(i, (i + 1), a);
                s = sb.toString();
            }
        }
        return s;
    }

    //计算加法结果并打印
    public void add(int a, int b){
        System.out.println(a + b);
    }

    //计算圆的面积并打印
    public void circle_area(int i){
        float pai = 3.14f;
        float area = i * i * pai;
        System.out.println(area);
    }

    //接收并打印出一个矩阵
    public void matrix(){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入矩阵横纵轴");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("输入矩阵内容");
        int[][] arr = new int[x][y];
        for(int i = 0; i < x; i++){
            for(int n = 0; n < y; n++) {
                arr[i][n] = sc.nextInt();
            }
        }
        for(int i = 0; i < x; i++){
            for(int n = 0; n < y; n++){
                System.out.print(arr[i][n] + " ");
            }
            System.out.println("");
        }
    }
}
