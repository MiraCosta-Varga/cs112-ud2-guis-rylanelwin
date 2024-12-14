package cs112.ud2.models;

public class Blackjack extends Game {
    private class Card implements Comparable<Object>{
        public int compareTo(Object other){
            return 1;
        }
    }
    public double play(){
        return 1;
    }
}
