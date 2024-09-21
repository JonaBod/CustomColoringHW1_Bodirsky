package cs301.birthdaycake;

public class CakeModel {

    public boolean candleLit = true;
    public int candleAmount = 2;
    public boolean hasFrosting = false;
    public boolean hasCandles = true;

    public CakeModel(){

    }

    // Getter method to check candleLit state
    public boolean isCandleLit() {
        return candleLit;
    }
    // setter to change the state of candleLit
    public void setCandleLit(boolean lit){
        this.candleLit = lit;
    }

    // Getter method to check hasCandles state
    public boolean isCandle() {
        return hasCandles;
    }
    // setter to change the state of hasCandles
    public void setCandle(boolean hasC){
        this.hasCandles = hasC;
    }

    // Getter method to check candleAmount
    public int getCandleAmount() {
        return candleAmount;
    }
    // setter to change the num of candleAmount
    public void setCandleAmount(int candleA){
        this.candleAmount = candleA;
    }

    // Getter method to check frosting state
    public boolean getFrosting() {
        return hasFrosting;
    }
    // setter to change the state of frosting
    public void setHasFrosting(boolean fr){
        this.hasFrosting = fr;
    }
}
