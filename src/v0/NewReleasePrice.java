package v0;

public class NewReleasePrice  extends Price{

    public NewReleasePrice(boolean _blueray) {
        super(_blueray);
    }

    @Override
    public double getRentalAmount(int duration) {
        return (super._blueray ? 1:0) + duration * 3;
    }

    @Override
    public int getFrequentRentalPoints(int duration) {
        return (duration > 1 ? 2:1) + (super._blueray ? 1:0) ;
    }
}
