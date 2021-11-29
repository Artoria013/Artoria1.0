package test2;
import java.util.Scanner;
import java.lang.String;

public class Plus_Student_Management {
    public static void main(String[] Demo){
        menu();
    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("---------------------");
            System.out.println("\t学生与老师管理系统\t");
            System.out.println("1.班级活动");
            System.out.println("2.学生与老师的异同");
            System.out.println("3.学生对待不同课的上课态度");
            System.out.println("4.学生信息录入");
            System.out.println("5.老师信息录入");
            System.out.println("6.班级名单");
            System.out.println("7.成绩单");
            System.out.println("8.某门科目平均成绩");
            System.out.println("9.学分");
            System.out.println("10.退出");

            int n = sc.nextInt();
            switch (n){
                case 1 -> Classes.Activities();
                case 2 -> Classes.Dif_Sam();
                case 3 -> Classes.Attitudes();
                case 4 -> Classes.Input_Student();
                case 5 -> Classes.input_Teacher();
                case 6 -> Classes.Class_List();
                case 7 -> Classes.School_Report();
                case 8 -> Classes.Arg_Subject_Score();
                case 9 -> Classes.Credit();
                case 10 -> {
                    System.out.println("已退出");
                    System.exit(0);
                }
                default -> System.out.println("输入错误，重新输入。");
            }
        }while(true);

    }
}
