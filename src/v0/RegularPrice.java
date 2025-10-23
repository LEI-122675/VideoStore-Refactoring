package v0;

public class RegularPrice extends Price {


    public RegularPrice(boolean _blueray) {
        super(_blueray);
    }

    @Override
    public double getRentalAmount(int duration) {
        double result = 2;
        if (duration > 2)
            result += (duration - 2) * 1.5;
        return result + (super._blueray ? 1:0);
    }

    @Override
    public int getFrequentRentalPoints(int duration) {
        return ( super._blueray ? 1:0) + 1 ;
    }
}
