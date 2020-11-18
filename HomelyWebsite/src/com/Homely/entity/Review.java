package com.Homely.entity;
// Generated Nov 11, 2020, 12:09:47 AM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Review generated by hbm2java
 */
@Entity
@Table(name = "review", catalog = "homely")
public class Review implements java.io.Serializable {

	private int reviewid;
	private Chef chef;
	private Customer customer;
	private int dishid;
	private int rating;
	private Date reviewtime;

	public Review() {
	}

	public Review(int reviewid, Chef chef, Customer customer, int dishid, int rating, Date reviewtime) {
		this.reviewid = reviewid;
		this.chef = chef;
		this.customer = customer;
		this.dishid = dishid;
		this.rating = rating;
		this.reviewtime = reviewtime;
	}

	@Id

	@Column(name = "reviewid", unique = true, nullable = false)
	public int getReviewid() {
		return this.reviewid;
	}

	public void setReviewid(int reviewid) {
		this.reviewid = reviewid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "chefid", nullable = false)
	public Chef getChef() {
		return this.chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customerid", nullable = false)
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Column(name = "dishid", nullable = false)
	public int getDishid() {
		return this.dishid;
	}

	public void setDishid(int dishid) {
		this.dishid = dishid;
	}

	@Column(name = "Rating", nullable = false)
	public int getRating() {
		return this.rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "reviewtime", nullable = false, length = 19)
	public Date getReviewtime() {
		return this.reviewtime;
	}

	public void setReviewtime(Date reviewtime) {
		this.reviewtime = reviewtime;
	}

}
