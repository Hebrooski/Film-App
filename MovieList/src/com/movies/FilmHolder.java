package com.movies;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FilmHolder {
	
	private List<Film> films = new ArrayList<>();
	
	
	boolean addToFilmHolder(Film filmIn) {
		return films.add(filmIn);
	}
	
	void printFilms() {
		Comparator<Film> alphabet = (film1,film2) -> {
			return film1.getName().compareTo(film2.getName());
		};
		films.sort(alphabet);
		for(Film current : films) {
			System.out.println(current);
		}
	}
	
	void printListByRating() {
		Comparator<Film> howTo = (film1,film2) -> film2.getRating() - film1.getRating();
		films.sort(howTo);
		for(Film current : films) {
			System.out.println(current);
		}
	}
	
	void searchByGenre(String genreIn) {
		for(Film current : films) {
			if(current.getGenre().toLowerCase().equals(genreIn.toLowerCase())) {
				System.out.println(current);
			}
		}
	}

}
