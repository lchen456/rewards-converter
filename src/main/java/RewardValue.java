
public class RewardValue{
    private double cashValue;
    private int milesValue;
    final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    //constructors
    public RewardValue(double cash){
        this.cashValue = cash;
        this.milesValue = convertCashtToMiles(cash);
    }

    public RewardValue(int miles){
        this.milesValue = miles;
        this.cashValue = convertMilesToCash(miles);
    }

    //convert
    private double convertMilesToCash(int miles){
        return this.milesValue*MILES_TO_CASH_CONVERSION_RATE;
    }

    private int convertCashtToMiles(double cash){
        return (int) (cash/MILES_TO_CASH_CONVERSION_RATE) ;
    }

    //getters
    public double getCashValue(){
        return this.cashValue;
    }

    public int getMilesValue(){
        return this.milesValue;
    }

}