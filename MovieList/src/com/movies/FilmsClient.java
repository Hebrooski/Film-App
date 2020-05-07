package com.movies;

public class FilmsClient {
	
	public static void main(String[] args) {
		FilmsControler films = new FilmsControler();
		
		films.printFilmsList();
		
		System.out.println("-----------------");
		
		films.sortOnRating();
		//films.printFilmsList();
		
		System.out.println("------------------------------");
		
		films.searchGenre("Adventure");
	}

}
