package com.movies;

public class FilmsControler {
	
	private FilmBuilder films = new FilmBuilder(new FilmReader("Movies.csv").getFilms());
	private FilmHolder holder = films.getHolder();
	
	void printFilmsList() {
		holder.printFilms();
	}
	
	void sortOnRating() {
		holder.printListByRating();
	}
	
	void searchGenre(String search) {
		holder.searchByGenre(search);
	}
	

}
