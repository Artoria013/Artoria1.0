package String_Instrument;

import java.util.Scanner;

public class String_Instrument {
    public static void main(String[] Demo){
        String[] str = {"acbdw", "1269547", "AASIDX", "AIUydjs", "12sjaA", "3819247", "ausSHSzio", "IUFISsi"};
        while(true) {
            System.out.println("请选择功能：");
            System.out.println("1. 判断字符串是否全是数字：");
            System.out.println("2. 判断字符串是否是大写字母：");
            System.out.println("3. 判断字符串是否全是小写字母：");
            System.out.println("4. 如果字符串全是字母，将其中所有小写字母转换为大写字母：");
            System.out.println("5. 如果字符串全是数字组成，则按照数字大小升序排序并装入整型数组中。最后按升序打印出该数组：");
            System.out.println("6. 如果字符串全是字母组成，则按照字母排序装入字符数组中，并按字母顺序打印出该该数组:");
            System.out.println("7. 退出");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if(choice < 1 || choice > 7){
                System.out.println("输入错误，请重新输入。");
            }
            else {
                switch (choice) {
                    case 1 -> are_all_numbers(str);
                    case 2 -> are_all_capital(str);
                    case 3 -> are_all_minuscule(str);
                    case 4 -> minuscule_to_capital(str);
                    case 5 -> numbers_rank_print(str);
                    case 6 -> litters_rank_print(str);
                    case 7 -> {
                        System.out.println("已退出");
                        System.exit(0);
                    }
                }
            }
        }
    }

    //判断字符串是否全是数字
    public static void are_all_numbers(String[] str){
        for(int i = 0; i < str.length; i++){
            int n;
            for(n = 0; n < str[i].length(); n++){
                char ch = str[i].charAt(n);
                if(ch < 48 || ch > 57) break;
            }
            if(n < str[i].length())
                System.out.println("第" + (i + 1) + "个字符串不全是数字");
        }
    }

    //判断字符串是否是大写字母
    public static void are_all_capital(String[] str){
        for(int i = 0; i < str.length; i++){
            int n;
            for(n = 0; n < str[i].length(); n++){
                char ch = str[i].charAt(n);
                if(ch < 65 || ch > 90) break;
            }
            if(n < str[i].length())
                System.out.println("第" + (i + 1) + "个字符串不全是大写字母");
        }
    }

    //判断字符串是否全是小写字母
    public static void are_all_minuscule(String[] str){
        for(int i = 0; i < str.length; i++){
            int n;
            for(n = 0; n < str[i].length(); n++){
                char ch = str[i].charAt(n);
                if(ch < 97 || ch > 122) break;
            }
            if(n < str[i].length())
                System.out.println("第" + (i + 1) + "个字符串不全是小写字母");
        }
    }

    //如果字符串全是字母，将其中所有小写字母转换为大写字母
    public static void minuscule_to_capital(String[] str){
        for(int i = 0; i < str.length; i++){
            int n;
            for(n = 0; n < str[i].length(); n++){
                char ch = str[i].charAt(n);
                //判断是否都是字母
                if((ch < 97 || ch > 122) && (ch < 65 || ch > 90)) break;
                //安全的可变字符串
                StringBuilder sb = new StringBuilder(str[i]);
                //将小写字母转换为大写字母
                if(Character.isLowerCase(ch)){
                    ch = Character.toUpperCase(ch);
                    String s = Character.toString(ch);
                    sb.replace(n, (n + 1), s);
                    str[i] = sb.toString();
                }

            }
            if(n == str[i].length()){
                System.out.println("第" + (i + 1) + "个字符串全是字母");
                System.out.println("现在它为" + str[i]);
            }
        }
    }

    //如果字符串全是数字组成，则按照数字大小升序排序并装入整型数组中。最后按升序打印出该数组
    public static void numbers_rank_print(String[] str){

    }

    //如果字符串全是字母组成，则按照字母排序装入字符数组中，并按字母顺序打印出该该数组
    public static void litters_rank_print(String[] str){

    }

}
