package v0;


public class Rental
{
    v0.Movie _movie;
    private int	_daysRented;

    public Rental(v0.Movie movie, int daysRented)
    {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented()
    {
        return _daysRented;
    }

    public Movie getMovie()
    {
        return _movie;
    }
}
