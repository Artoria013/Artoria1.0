package text4;

import java.util.Scanner;

public class Calculator_plus {
    public static void main(String[] Demo){
        while(true){
            System.out.println("选择计算类型：");
            System.out.println("1. 加法");
            System.out.println("2. 减法");
            System.out.println("3. 乘法");
            System.out.println("4. 除法");
            System.out.println("5. 退出");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if(a == 5) break;
            if(a > 5) continue;
            switch (a) {
                case 1 -> {
                    Add add = new Add();
                    add.setArr(add.receive());
                    add.calculate(add.getArr());
                }
                case 2 -> {
                    Sub sub = new Sub();
                    sub.setArr(sub.receive());
                    sub.calculate(sub.getArr());
                }
                case 3 -> {
                    Mul mul = new Mul();
                    mul.setArr(mul.receive());
                    mul.calculate(mul.getArr());
                }
                case 4 -> {
                    Div div = new Div();
                    div.setArr(div.receive());
                    div.calculate(div.getArr());
                }
            }

        }
    }
}

abstract class Calculator{
    private double[] arr = new double[2];

    //接收计算的值（2个）
    public double[] receive(){
        System.out.println("请输入值（一次仅计算2个数值）：");
        Scanner sc = new Scanner(System.in);
        double[] arr1 = new double[2];
        arr1[0] = sc.nextInt();
        arr1[1] = sc.nextInt();
        return arr1;
    }
    //具体计算方式
    abstract void calculate(double[] arr);

    public void setArr(double[] arr){
        this.arr = arr;
    }

    public double[] getArr(){
        return arr;
    }
}

//加法计算子类
class Add extends Calculator{
    public void calculate(double[] arr){
        double csq = arr[0] + arr[1];
        System.out.println("=" + csq);
    }
}

//减法计算子类
class Sub extends Calculator{
    public void calculate(double[] arr){
        double csq = arr[0] - arr[1];
        System.out.println("=" + csq);
    }
}

//乘法计算子类
class Mul extends Calculator{
    public void calculate(double[] arr){
        double csq = arr[0] * arr[1];
        System.out.println("=" + csq);
    }
}

//除法计算子类
class Div extends Calculator{
    public void calculate(double[] arr){
        double csq = arr[0] / arr[1];
        System.out.println("=" + csq);
    }
}