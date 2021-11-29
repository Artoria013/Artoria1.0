package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Classes {
    //学生与老师对象集合
    static ArrayList<Student> student = new ArrayList<>();
    static ArrayList<Teacher> teacher = new ArrayList<>();
    static Student st = new Student();
    static Teacher te = new Teacher();
    private static final long Class_Number = 34092101;

    //学生与老师的异同
    public static void Dif_Sam(){
        System.out.println("老师与学生的异同：");
        System.out.println("相同：\n" + st.getNormal_Life());
        System.out.println("不同：\n" + st.getJob() + "\n"+ te.getJob());
    }

    //学生对不同课的态度
    public static void Attitudes(){
        System.out.println("学生对待不同科目的态度：\n" + st.getAtd_C() + "\n" + st.getAtd_M() + "\n" + st.getAtd_J());
    }

    //班级活动
    public static void Activities(){
        System.out.println("班级活动：早自习，班会，体育比赛，团建。");
    }

    //学生信息录入
    public static void Input_Student() {
        do {
            Scanner sc = new Scanner(System.in);

            //学号
            long num;
            do {
                System.out.println("输入学生学号(1001~1040)：");
                num = sc.nextLong();
                if(num > 1000 && num < 1041)
                    break;
                else System.out.println("输入错误，重新输入。");
            }while(true);

            //姓名
            System.out.println("输入学生姓名：(中文名字)");
            String name = sc.next();

            //C语言成绩
            int c_score;
            do{
                System.out.println("输入学生C语言成绩：");
                c_score = sc.nextInt();
                if(c_score >= 0 && c_score <=100)
                    break;
                else System.out.println("输入错误，重新输入。");
            }while(true);

            //高数成绩
            int math_score;
            do{
                System.out.println("输入学生高数成绩：");
                math_score = sc.nextInt();
                if(math_score >= 0 && math_score <= 100)
                    break;
                else System.out.println("输入错误，重新输入。");
            }while(true);

            //Java成绩
            int java_score;
            do {
                System.out.println("输入Java成绩：");
                java_score = sc.nextInt();
                if (java_score >= 0 && java_score <= 100)
                    break;
                else System.out.println("输入错误，重新输入。");
            }while(true);

            //总成绩
            int total = c_score + math_score + java_score;

            //评级
            char level;
            if(total > 270)
                level = 'A';
            else if(total > 240)
                level = 'B';
            else if(total > 180)
                level = 'C';
            else
                level = 'D';

            //学分
            float credit = (total / 300.0f) * 4;

            //学生信息上传
            Student st = new Student();
            st.setStudent_NUmber(num);
            st.setName(name);
            st.setC_Score(c_score);
            st.setMath_Score(math_score);
            st.setJava_Score(java_score);
            st.setTotal(total);
            st.setLevel(level);
            st.setCredit(credit);
            student.add(st);

            //判断是否继续传入
            char a;
            do {
                System.out.println("继续输入其余学生信息？(Y/N)");
                a = sc.next().charAt(0);
                if (a == 'N' || a == 'Y') break;
                else System.out.println("输入错误，重新输入。");
            }while(true);
            if(a == 'N') break;
        }while(true);
    }

    //老师信息录入
    public static void input_Teacher(){
        do{
            Scanner sc = new Scanner(System.in);

            //工号
            long num;
            do{
                System.out.println("输入老师工号：(2001~2100)");
                num = sc.nextLong();
                if(num > 2000 && num <= 2100)
                    break;
                else System.out.println("输入错误，重新输入：");
            }while(true);

            //姓名
            System.out.println("输入老师姓名：");
            String name = sc.next();

            //学科
            String subject;
            System.out.println("输入老师学科：(C语言，高数，Java)");
            subject = sc.next();

            //老师信息上传
            Teacher te = new Teacher();
            te.setName(name);
            te.setJob_Number(num);
            te.setSubject(subject);
            teacher.add(te);

            //判断是否继续传入
            char a;
            do{
                System.out.println("继续输入老师信息？(Y/N)");
                a = sc.next().charAt(0);
                if(a == 'Y' || a == 'N') break;
                else System.out.println("输入错误，重新输入。");
            }while(true);
            if(a == 'N') break;
        }while(true);
    }

    //班级名单
    public static void Class_List() {
        //依照学号排序
        for (int x = 0; x < student.size(); x++) {
            for (int y = x + 1; y < student.size(); y++) {
                if (student.get(y).getStudent_NUmber() < student.get(x).getStudent_NUmber())
                    Collections.swap(student, y, x);
            }
        }
        System.out.println("\t\t\t学生");
        System.out.println("班级\t\t学号\t姓名");
        for (Student value : student) {
            System.out.printf("%d\t%d\t%s\n", Class_Number, value.getStudent_NUmber(), value.getName());
        }
        System.out.println("\t\t\t老师");
        System.out.println("班级\t\t工号\t姓名\t科目");
        for (Teacher value : teacher) {
            System.out.printf("%d\t%d\t%s\t\t%s\n", Class_Number, value.getJob_Number(), value.getName(), value.getSubject());
        }
    }

    //成绩单
    public static void School_Report(){
        Scanner sc = new Scanner(System.in);
        do {
            int a = 0;
            do {
                System.out.println("选择成绩排序方式：");
                System.out.println("1.C语言");
                System.out.println("2.高数");
                System.out.println("3.Java");
                System.out.println("4.总成绩");
                int n = sc.nextInt();

                //生成不同排序方式成绩单
                switch (n) {
                    case 1 -> {
                        for (int x = 0; x < student.size(); x++) {
                            for (int y = x + 1; y < student.size(); y++) {
                                if (student.get(y).getC_Score() > student.get(x).getC_Score())
                                    Collections.swap(student, y, x);
                            }
                        }
                    }
                    case 2 -> {
                        for (int x = 0; x < student.size(); x++) {
                            for (int y = x + 1; y < student.size(); y++) {
                                if (student.get(y).getMath_Score() > student.get(x).getMath_Score())
                                    Collections.swap(student, y, x);
                            }
                        }
                    }
                    case 3 -> {
                        for (int x = 0; x < student.size(); x++) {
                            for (int y = x + 1; y < student.size(); y++) {
                                if (student.get(y).getJava_Score() > student.get(x).getJava_Score())
                                    Collections.swap(student, y, x);
                            }
                        }
                    }
                    case 4 -> {
                        for (int x = 0; x < student.size(); x++) {
                            for (int y = x + 1; y < student.size(); y++) {
                                if (student.get(y).getTotal() > student.get(x).getTotal())
                                    Collections.swap(student, y, x);
                            }
                        }
                    }
                    default -> {
                        System.out.println("输入错误");
                        a = 1;
                    }
                }
            }while(a != 0);

            //显示成绩单
            System.out.println("\t\t\t\t\t\t\t学生");
            System.out.println("学号\t班级\t\t姓名\tC语言成绩\t高数成绩\tJava成绩\t总成绩\t评级");
            for (Student value : student) {
                System.out.printf("%d\t%d\t%s\t%d\t\t\t%d\t\t%d\t\t\t%d\t\t%c\n", value.getStudent_NUmber(), Class_Number, value.getName(), value.getC_Score(), value.getMath_Score(), value.getJava_Score(), value.getTotal(), value.getLevel());
            }

            char ch;
            do {
                System.out.println("继续查看其他排序方式？(Y/N)");
                ch = sc.next().charAt(0);
                if (ch == 'N' || ch == 'Y') break;
                else System.out.println("输入错误，重新输入。");
            }while(true);
            if(ch == 'N') break;
        }while(true);
    }

    //某门科目平均成绩
    public static void Arg_Subject_Score() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.C语言");
            System.out.println("2.高数");
            System.out.println("3.Java");
            System.out.println("选择你要查看的成绩：");
            int n = sc.nextInt();
            switch (n) {
                case 1 -> {
                    int sum_c = 0;
                    for (Student value : student)
                        sum_c += value.getC_Score();
                    System.out.println("C语言平均成绩为：" + (float) sum_c / (float) student.size());
                }
                case 2 -> {
                    int sum_m = 0;
                    for (Student value : student)
                        sum_m += value.getMath_Score();
                    System.out.println("高数平均成绩为：" + (float) sum_m / (float) student.size());
                }
                case 3 -> {
                    int sum_j = 0;
                    for (Student value : student)
                        sum_j += value.getJava_Score();
                    System.out.println("Java平均成绩为：" + (float) sum_j / (float) student.size());
                }
                default -> System.out.println("输入错误。");
            }
            char ch;
            do {
                System.out.println("继续查看其他成绩？(Y/N)");
                ch = sc.next().charAt(0);
                if (ch == 'N' || ch == 'Y') break;
                else System.out.println("输入错误，重新输入。");
            }while(true);
            if(ch == 'N') break;
        }while(true);
    }

    //学分
    public static void Credit(){
        for (int x = 0; x < student.size(); x++) {
            for (int y = x + 1; y < student.size(); y++) {
                if (student.get(y).getLevel() < student.get(x).getLevel())
                    Collections.swap(student, y, x);
            }
        }
        System.out.println("\t\t学分\t");
        System.out.println("学号\t姓名\t学分");
        for(Student value : student) {
            System.out.printf("%d\t%s\t%f\n", value.getStudent_NUmber(), value.getName(), value.getCredit());
        }
    }
}
