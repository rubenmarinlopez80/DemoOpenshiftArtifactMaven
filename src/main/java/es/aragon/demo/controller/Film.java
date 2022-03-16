package es.aragon.demo.controller;



public class Film {


	private String title;
	

	private Integer year;
	

	private String director;

	private Film() {
		
	}
	
	public Film(String title, Integer year, String director) {
		this.title = title;
		this.year = year;
		this.director = director;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getDirector() {
		return director;
	}
	
	

}
