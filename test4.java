public class text4 {
    public static void main(String[]args){
    int a=2;
    for(a=2;a<201;a++){
        boolean i= true;
    for(int b=2;b<a;b++) {
        if (a % b == 0) {
            i = false;
            break;
        }
    }
    if(i) {
        System.out.println(a);
    }}
    }
    }




