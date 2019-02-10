package org.wecancodeit.moviereviewssite;

public class Review {

	private Long id;
	private String title;
	private String imageUrl;
	private String genre;
	private String content;
	private String date;
	private String synopsis;

	public Long getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public Review(Long id, String title, String imageUrl, String genre, String content, String date,
			String synopsis) {
		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.genre = genre;
		this.content = content;
		this.date = date;
		this.synopsis = synopsis;
	}


}
