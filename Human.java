package test2;

public class Human {
    private final static String Normal_Life = "正常生活：吃喝拉撒睡。";
    public String getNormal_Life(){
        return Normal_Life;
    }
}

//老师类
class Teacher extends Human{

    private long Job_Number;
    private String Name;
    private String Subject;
    private String Job = "老师工作：给学生们上课。";

    //创建老师对象
    public Teacher(){}
    public Teacher(long job_Number, String name, String subject, String job){
        Job_Number = job_Number;
        Name = name;
        Subject = subject;
        Job = job;
    }

    //设置信息
    public void setJob_Number(long job_Number){
        Job_Number = job_Number;
    }
    public void setName(String name){
        Name = name;
    }
    public void setSubject(String subject){
        Subject = subject;
    }

    //获取信息
    public long getJob_Number(){
        return Job_Number;
    }
    public String getName(){
        return Name;
    }
    public String getSubject(){
        return Subject;
    }
    public String getJob(){
        return Job;
    }

}

//学生类
class Student extends Human{

    private long Student_NUmber;
    private String Name;
    private int C_Score;
    private int Math_Score;
    private int Java_Score;
    private int Total;
    private char Level;
    private float Credit;
    private String Job = "学生工作：上课。";
    private String Atd_C = "对C语言：被指针折磨。";
    private String Atd_M = "对高数：被证明折磨。";
    private String Atd_J = "对Java：被知识量折磨。";

    public Student(){}
    public Student(long student_NUmber, String name, int c_Score, int math_Score, int java_Score, int total, char level, float credit, String job, String atd_C, String atd_M, String atd_J){
        Student_NUmber = student_NUmber;
        Name = name;
        C_Score = c_Score;
        Math_Score = math_Score;
        Java_Score = java_Score;
        Total = total;
        Level = level;
        Credit = credit;

        Job = job;
        Atd_C = atd_C;
        Atd_M = atd_M;
        Atd_J = atd_J;
    }

    //设置学生信息
    public void setStudent_NUmber(long student_nUmber){
        Student_NUmber = student_nUmber;
    }
    public void setName(String name){
        Name = name;
    }
    public void setC_Score(int c_Score){
        C_Score = c_Score;
    }
    public void setMath_Score(int math_Score){
        Math_Score = math_Score;
    }
    public void setJava_Score(int java_Score){
        Java_Score = java_Score;
    }
    public void setTotal(int total){
        Total = total;
    }
    public void setLevel(char level){
        Level = level;
    }
    public void setCredit(float credit){
        Credit = credit;
    }

    //传出学生信息
    public long getStudent_NUmber(){
        return Student_NUmber;
    }
    public String getName(){
        return Name;
    }
    public int getC_Score(){
        return C_Score;
    }
    public int getMath_Score(){
        return Math_Score;
    }
    public int getJava_Score(){
        return Java_Score;
    }
    public int getTotal(){
        return Total;
    }
    public char getLevel(){
        return Level;
    }
    public float getCredit(){
        return Credit;
    }
    public String getJob(){
        return Job;
    }
    public String getAtd_C(){
        return Atd_C;
    }
    public String getAtd_M(){
        return Atd_M;
    }
    public String getAtd_J(){
        return Atd_J;
    }
}