package org.wecancodeit.moviereviewssite;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {
	
	
	HashMap<Long, Review> reviewList = new HashMap<>();
	
	Review one = new Review(1L, "titleOne", "imageOne", "genreOne", "content", "date", "synopsis");
	Review two = new Review(2L, "titleTwo", "imageTwo", "genreTwo", null, null, null);
	
	public ReviewRepository() {
		reviewList.put(1L, one);
		reviewList.put(2L, two);
	}
	
	//constructor for testing purposes.
	public ReviewRepository(Review ...reviews) {
		for(Review review:reviews) {
			reviewList.put(review.getId(), review);
		}
	}

	public Review findOne(Long id) {
		return reviewList.get(id);
	}

	public Collection<Review> findAll() {
		return reviewList.values();
	}

}
