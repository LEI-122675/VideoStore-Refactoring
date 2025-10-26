package v0;

public class BestPrice extends Price {


    public BestPrice(boolean _blueray) {
        super(_blueray);
    }

    @Override
    public double getRentalAmount(int duration) {
        return 1;
    }

    @Override
    public int getFrequentRentalPoints(int duration) {
        return 0;
    }
}
