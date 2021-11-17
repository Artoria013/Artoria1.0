package text3;

import java.util.Scanner;

//人类
class human {
    String Race = "人类";
    String life_habit = "每天需要吃饭与休息（但睡眠时间都不足=-=）";
}

//老师类
class teacher extends human{
    static String input(int i){
        String str = "";
        StringBuilder sb = new StringBuilder(str);
        switch (i) {
            case 1 -> {
                sb.delete(0, sb.length());
                sb.append("老师在学校教学生。");
            }
            case 2 -> {
                sb.delete(0, sb.length());
                sb.append("老师熬夜判作业和卷子。");
            }
            case 3 -> {
                sb.delete(0, sb.length());
                sb.append("老师对自己的科目理解更深刻。");
            }
            case 4 -> {
                sb.delete(0, sb.length());
                sb.append("老师希望学生把更多时间投入到学习上，而不是游戏。");
            }
            case 5 -> {
                sb.delete(0, sb.length());
                sb.append("老师更多烦恼于金钱与工作压力");
            }
        }
        str = sb.toString();

        return str;
    }

}

//学生类
class student extends human{
    static String input(int i){
        String str = "";
        StringBuilder sb = new StringBuilder(str);
        switch (i) {
            case 1 -> {
                sb.delete(0, sb.length());
                sb.append("学生在学校学习。");
            }
            case 2 -> {
                sb.delete(0, sb.length());
                sb.append("学生熬夜写作业。");
            }
            case 3 -> {
                sb.delete(0, sb.length());
                sb.append("学生对全科知识的掌握更广泛。");
            }
            case 4 -> {
                sb.delete(0, sb.length());
                sb.append(("学生更希望更多花时间去放松娱乐。"));
            }
            case 5 -> {
                sb.delete(0, sb.length());
                sb.append("学生更多烦恼于自己的成绩与人际关系");
            }
        }
        str = sb.toString();
        return str;
    }
}

//Demo
public class human_teacher_student{
    public static void main(String[] Demo){
        Scanner sc = new Scanner(System.in);
        teacher t = new teacher();
        student s = new student();
        //显示相同点
        System.out.println("----学生与老师的相同点----");
        System.out.println("老师：" + t.Race);
        System.out.println("学生：" + s.Race);
        System.out.println("老师：" + t.life_habit);
        System.out.println("学生：" + s.life_habit);

        while(true) {
            System.out.println("----老师与学生的不同点----");
            System.out.println("1.在学校的工作：");
            System.out.println("2.熬夜时在做什么：");
            System.out.println("3.对知识的掌握：");
            System.out.println("4.对于娱乐游戏的态度：");
            System.out.println("5.生活中的烦恼：");
            System.out.println("6.退出");

            int i = sc.nextInt();
            if (i == 6) break;
            if (i < 1 || i > 6)
                System.out.println("输入错误，重新选择");
            else {
                System.out.println(t.input(i));
                System.out.println(s.input(i));
            }
        }
    }
}
