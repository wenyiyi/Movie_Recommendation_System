package com.domain;

public class RecommendId implements java.io.Serializable {

	private static final long serialVersionUID = -2316987049874959068L;
	
	private User user;
	private Film film;

	public RecommendId() {
	}

	public RecommendId(User user, Film film) {
		this.user = user;
		this.film = film;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Film getFilm() {
		return this.film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RecommendId))
			return false;
		RecommendId castOther = (RecommendId) other;

		return ((this.getUser() == castOther.getUser()) || (this.getUser() != null && castOther.getUser() != null
				&& this.getUser().equals(castOther.getUser())))
				&& ((this.getFilm() == castOther.getFilm()) || (this.getFilm() != null && castOther.getFilm() != null
						&& this.getFilm().equals(castOther.getFilm())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUser() == null ? 0 : this.getUser().hashCode());
		result = 37 * result + (getFilm() == null ? 0 : this.getFilm().hashCode());
		return result;
	}

}