package text3_2;
//写一个电话卡的类（PhoneCard），账号：cardNumber，初始金额：initMoney，使用时间：time（单位：分钟），计费方式：minMoney。
//编写两个电话卡的子类：ip卡和201卡，它们的计费方式不同（每分钟费用分别为0.3和0.45）；两张卡的初始金额是30，给定一个时间time=5，分别计算出剩余金额。
public class PhoneCard {
    private String cardNumber;
    private int intMoney = 30;
    private int time = 5;
    public float cost;

    public PhoneCard(){};

    public PhoneCard(String cardNumber, int intMoney, int time, float cost){
        this.cardNumber = cardNumber;
        this.intMoney = intMoney;
        this.time = time;
        this.cost = cost;
    }

    //设置cardNumber
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public int getIntMoney() {
        return intMoney;
    }

    public int getTime(){
        return time;
    }

    public float getCost(){
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float balance(){
        float balance = intMoney - time * cost;
        return balance;
    }

}

class CardIp extends PhoneCard{
    //public CardIp(){}
    public CardIp(){
        setCardNumber("0000001");
        setCost(0.3f);

    }
}

class Card201 extends PhoneCard{
    //public Card201(){}
    public Card201(){
        setCardNumber("0000002");
        setCost(0.45f);
    }
}
