package com.movies;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

public class MoviesTest {
	
	@Test
	void testReader() throws FileNotFoundException {
		FilmReader films = new FilmReader("Movies.csv");
		boolean actual =  films.getFilms() != null;
		assertTrue(actual);
	}
	
	@Test
	void testAddingToFilmHolder() {
		FilmHolder holder = new FilmHolder();
		boolean actual = holder.addToFilmHolder(new Film("String", "String", 1, "String", 1));
		assertTrue(actual);
	}

}
