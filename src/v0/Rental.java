package v0;

import v7.Movie;

public class Rental
{
    v7.Movie _movie;
    private int		_daysRented;

    public Rental(v7.Movie movie, int daysRented)
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
