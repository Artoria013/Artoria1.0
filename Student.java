package Student_Management;

public class Student {
    //姓名
    private String Name;

    //成绩
    private int Score_Chinese;
    private int Score_Math;
    private int Score_English;
    private float Score_Arrangement;

    //定义一个无参数构造方法
    public Student(){}

    //创建学生信息对象
    public Student(String name, int score_Chinese, int score_Math, int score_English, float score_Arrangement){
        Name = name;
        Score_Chinese = score_Chinese;
        Score_Math = score_Math;
        Score_English = score_English;
        Score_Arrangement = score_Arrangement;
    }

    //学生信息的录入
    public void setName(String name){ Name = name; }

    public void setScore_Chinese(int score_Chinese){
        Score_Chinese = score_Chinese;
    }

    public void setScore_Math(int score_Math){
        Score_Math = score_Math;
    }

    public void setScore_English(int score_English){
        Score_English = score_English;
    }

    public void setScore_Arrangement(float score_arrangement){ Score_Arrangement = score_arrangement; }

    //学生信息的传出
    public String getName(){
        return Name;
    }

    public int getScore_Chinese(){
        return Score_Chinese;
    }

    public int getScore_Math(){
        return Score_Math;
    }

    public int getScore_English(){
        return Score_English;
    }

    public float getScore_Arrangement(){ return Score_Arrangement; }
}
