package Student_Management;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Student_Management {

    public static void main(String[] Demo){
        //创建对象集合，用于存储学生信息
        ArrayList<Student> student = new ArrayList<>();
        //Scanner sc = new Scanner(System.in);
        while(true) {
            menu(student);
        }
    }

    //主菜单
    public static void menu(ArrayList<Student> student){
        //目录
        System.out.println("----学生成绩管理系统----");
        System.out.println("1. 录入学生信息");
        System.out.println("2. 计算平均成绩");
        System.out.println("3. 成绩排名");
        System.out.println("4. 成绩评价");
        System.out.println("5. 退出系统");

        //输入选择
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a < 1 || a > 5){
            System.out.println("输入有误，请重新输入");
            menu(student);
        }
        else{
            switch (a) {
                case 1 -> Input(student);
                case 2 -> Arrangement(student);
                case 3 -> Rank(student);
                case 4 -> Evaluation(student);
                case 5 -> {
                    System.out.println("已退出");
                    System.exit(0);
                }
            }
        }
    }

    //学生信息录入
    public static void Input(ArrayList<Student> student){
        //对象-学生信息
        while(true){
            Scanner sc = new Scanner(System.in);//每输入一次都需new一次
            //输入
            System.out.println("请输入学生姓名：");
            String name = sc.nextLine();
            int sC;
            while(true) {
                System.out.println("请输入学生语文成绩：");
                sC = sc.nextInt();
                if(sC < 0 || sC > 100){
                    System.out.println("输入数据错误，请重新输入：");
                }
                else break;
            }
            int sM;
            while(true) {
                System.out.println("请输入学生数学成绩：");
                sM = sc.nextInt();
                if(sM < 0 || sM > 100){
                    System.out.println("输入数据错误，请重新输入：");
                }
                else break;
            }
            int sE;
            while(true) {
                System.out.println("请输入学生英语成绩：");
                sE = sc.nextInt();
                if(sE < 0 || sE > 100){
                    System.out.println("输入数据错误，请重新输入：");
                }
                else break;
            }
            //计算成绩平均值
            float arg = ((sC + sE + sM) / 3.0f);//在=后面加入(float)
            //将数据传入学生信息对象
            Student st = new Student(name, sC, sM, sE, arg);
            st.setName(name);
            st.setScore_Chinese(sC);
            st.setScore_Math(sM);
            st.setScore_English(sE);
            st.setScore_Arrangement(arg);
            student.add(st);

            //成功后的提示
            System.out.println("添加成功");
            //判断是否继续
            char x;
            while(true) {
                System.out.println("还要继续添加吗？(Y/N)");
                x = sc.next().charAt(0);
                if (x == 'N') break;
                else if (x != 'Y')
                    System.out.println("输入错误，请重新输入。");
                else break;
            }
            if(x == 'N') break;
        }
    }

    //计算平均成绩
    public static void Arrangement(ArrayList<Student> student){
        for (Student st : student) {
            //取学生信息对象
            System.out.print(st.getName() + "的平均成绩为：");
            System.out.println(String.format("%.2f",st.getScore_Arrangement()));
        }
    }

    //成绩排名
    public static void Rank(ArrayList<Student> student){
        System.out.println("---------成绩排名---------");
        System.out.println("名次 姓名       成绩(平均)");
        //按照成绩改变学生信息对象在集合中的顺序
        for(int i = 0; i < student.size(); i++){
            Student st = student.get(i);//不需要new
            for(int x = i + 1; x < student.size(); x++){
                Student st_ = student.get(x);
                if(st_.getScore_Arrangement() > st.getScore_Arrangement())
                    Collections.swap(student,x,i);
            }
        }
        //遍历显示排名
        for(int i = 0; i < student.size(); i++){
            Student st = student.get(i);
            String name = String.format("%-4s",st.getName());
            float score = st.getScore_Arrangement();
            System.out.println(" " + (i + 1) + "  " + name + "       " + String.format("%.2f",score));
        }
    }

    //成绩评价
    public static void Evaluation(ArrayList<Student> student){
        System.out.println("------成绩评价------");
        for (Student st : student) {
            //对名字进行空格补全
            String name = String.format("%-4s", st.getName());
            int C = st.getScore_Chinese();
            int M = st.getScore_Math();
            int E = st.getScore_English();
            int A = (int) st.getScore_Arrangement();
            int[] arr = {C, M, E, A};
            char[] ch = new char[4];
            //遍历进行评价
            for (int n = 0; n < arr.length; n++) {
                if (arr[n] >= 90)
                    ch[n] = 'A';
                else if (arr[n] < 90 && arr[n] > 60)
                    ch[n] = 'B';
                else
                    ch[n] = 'C';
            }
            System.out.println(name + "语文：" + ch[0] + "  数学: " + ch[1] +"  英语: " + ch[2] + "  总体: " + ch[3]);
        }
    }
}