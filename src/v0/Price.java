package v0;

public abstract class Price
{


    public boolean	_blueray;

    public Price(boolean _blueray) {
        this._blueray = _blueray;
    }

    public boolean is_blueray() {
        return _blueray;
    }

    public abstract double getRentalAmount(int duration);
    public abstract int getFrequentRentalPoints(int duration);

}

