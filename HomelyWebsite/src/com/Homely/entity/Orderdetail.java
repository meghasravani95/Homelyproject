package com.Homely.entity;
// Generated Nov 11, 2020, 12:09:47 AM by Hibernate Tools 5.2.12.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Orderdetail generated by hbm2java
 */
@Entity
@Table(name = "orderdetail", catalog = "homely")
public class Orderdetail implements java.io.Serializable {

	private OrderdetailId id;
	private Dish dish;
	private Dishorder dishorder;

	public Orderdetail() {
	}

	public Orderdetail(OrderdetailId id, Dish dish, Dishorder dishorder) {
		this.id = id;
		this.dish = dish;
		this.dishorder = dishorder;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "dishid", column = @Column(name = "dishid", nullable = false)),
			@AttributeOverride(name = "orderid", column = @Column(name = "orderid", nullable = false)),
			@AttributeOverride(name = "quantity", column = @Column(name = "quantity", nullable = false)),
			@AttributeOverride(name = "subtotal", column = @Column(name = "subtotal", nullable = false, precision = 12, scale = 0)) })
	public OrderdetailId getId() {
		return this.id;
	}

	public void setId(OrderdetailId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dishid", nullable = false, insertable = false, updatable = false)
	public Dish getDish() {
		return this.dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "orderid", nullable = false, insertable = false, updatable = false)
	public Dishorder getDishorder() {
		return this.dishorder;
	}

	public void setDishorder(Dishorder dishorder) {
		this.dishorder = dishorder;
	}

}