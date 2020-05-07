package com.movies;

import java.io.BufferedReader;
import java.io.IOException;

public class FilmBuilder {
	
	private FilmHolder holder = new FilmHolder();
	private BufferedReader films;
	
	FilmBuilder(BufferedReader file){
		films = file;
		try {
			fillFilmsList();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	private void fillFilmsList() throws IOException {
		String film = "";
		while((film = films.readLine()) != null) {
			String[] elements = film.split(",");
			
			holder.addToFilmHolder(new Film(elements[0],elements[1],Integer.parseInt(elements[2]),elements[3],
					Integer.parseInt(elements[4])));
			
		}
	}
	
	FilmHolder getHolder() {
		return holder;
	}

}
