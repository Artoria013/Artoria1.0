public class test3 {
    public static void main(String[]args){
    for(int num=100;num<1000;num++){
      int  a=num/100;
      int  b=(num-a*100)/10;
      int  c=num-a*100-b*10;
    if(num == a * a * a + b * b * b + c * c * c){
        System.out.println("水仙花数有："+num);
    }
    }
}}
