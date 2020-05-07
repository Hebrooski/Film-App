package com.movies;

public class Film {
	
	private String name;
	private String type;
	private int releaseYear;
	private String genre;
	private int rating;
	
	Film(String name, String type, int releaseYear, String genre, int rating){
		setName(name);
		setType(type);
		setReleaseYear(releaseYear);
		setGenre(genre);
		setRating(rating);
	}
	
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	private void setType(String type) {
		this.type = type;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	private void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getGenre() {
		return genre;
	}
	private void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRating() {
		return rating;
	}
	private void setRating(int rating) {
		if(rating > 5 || rating < 0) {
			throw new IllegealRatingException();		
		}
		this.rating = rating;
	}

	@Override
	public String toString() {
		return String.format("Film %s, %s, %s, %s, %s]", name, type, releaseYear,
				genre, rating);
	}
	
	

}
