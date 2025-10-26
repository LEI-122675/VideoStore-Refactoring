package v0;

public class ChildrensPrice extends Price {

    public ChildrensPrice(boolean _blueray) {
        super(_blueray);
    }

    @Override
    public double getRentalAmount(int duration) {
        double result = 1.5;
        if (duration > 3)
            result += (duration - 3) * 1.5;
        if (super._blueray)
            result++;
        return result;
    }

    @Override
    public int getFrequentRentalPoints(int duration) {
        return super._blueray? 2:1;
    }
}
