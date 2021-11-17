package text3_2;

public class Demo {
    public static void main(String[] Demo){
        CardIp ci = new CardIp();

        System.out.println("ip卡，账号：" + ci.getCardNumber());
        System.out.println("剩余金额：" + ci.balance());
        Card201 c201 = new Card201();
        System.out.println("ip卡，账号：" + c201.getCardNumber());
        System.out.println("剩余金额：" + c201.balance());
    }
}
