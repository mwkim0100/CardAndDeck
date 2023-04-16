package CardAndDeck;

//덱에는 52개의 카드가 있고. 카드는 클럽,다이아몬드,하트,스페이드 4종류로 구별된다.
//각 종류마다 에이스,잭,퀸,킹,1,2,3,4,5,6,7,8,9이 한 장 씩 있다.
//덱에서 원하는 카드 한장을 뽑는 프로그램을 구현하겠다.

interface Card{
    public abstract void __str__(String a);

}
class Club_Card implements Card{
    public void __str__(String a){
        System.out.println("[클럽"+" "+a+"]");
    }
}
class Diamond_Card implements Card{
    public void __str__(String a){
        System.out.println("[다이아몬드"+" "+a+"]");
    }
}
class Heart_Card implements Card{
    public void __str__(String a){
        System.out.println("[하트"+" "+a+"]");
    }
}
class Spaed_Card implements Card{
    public void __str__(String a){
        System.out.println("[스페이드"+" "+a+"]");
    }
}
public class Deck {
    public static void main(String[] args){
        Card card1 = new Club_Card();
        Card card2 = new Diamond_Card();
        Card card3 = new Heart_Card();
        Card card4 = new Spaed_Card();

        card1.__str__("에이스");

    }

}
