package com.movies;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FilmReader {
	
	private BufferedReader films;
	
	FilmReader(String fileName){
		readFilm(fileName);
	}

	private void readFilm(String fileName)  {
		try {
			films = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	BufferedReader getFilms() {
		return films;
	}

}
