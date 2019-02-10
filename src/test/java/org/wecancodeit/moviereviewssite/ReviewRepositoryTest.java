package org.wecancodeit.moviereviewssite;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.Collection;

import org.junit.Test;


public class ReviewRepositoryTest {

	ReviewRepository underTest;
	Long firstReviewId = 1L;
	private Review firstReview = new Review(firstReviewId, "firstTitle", "firstImageUrl", "firstCategory",
			"firstContent", "firstDate", "firstSynopsis");
	Long secondReviewId = 2L;
	private Review secondReview = new Review(secondReviewId, "secondTitle", "secondImageUrl", "secondCategory",
			"secondContent", "secondDate", "secondSynopsis");

	@Test
	public void shouldFindAReview() {
		underTest = new ReviewRepository(firstReview);
		Review result = underTest.findOne(firstReviewId);
		assertThat(result, is(firstReview));
	}
	
	@Test
	public void shouldFindASecondReview() {
		underTest = new ReviewRepository(secondReview);
		Review result = underTest.findOne(secondReviewId);
		assertThat(result, is(secondReview));
	}
	
	@Test
	public void shouldFindAllReviews() {
		underTest = new ReviewRepository(firstReview, secondReview);
		Collection<Review> result = underTest.findAll();
		assertThat(result, containsInAnyOrder(firstReview, secondReview));
	}

}
