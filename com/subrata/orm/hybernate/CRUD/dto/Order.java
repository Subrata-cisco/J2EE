package com.subrata.orm.hybernate.CRUD.dto;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "ORDER_TTM")
@NamedQuery (name="order.byID", query = "from order where orderId > ?")
@NamedNativeQuery (name="order.byName", query = "Select * from order where orderId = ?",resultClass =Order.class) // pure sql query.
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)  // cache.use_second_level_cache = true && cache.provider_class = org.hibernate.cache.EhCacheProvider
                                                     // cache.use_query_cache = true is needed for caching the query.
//@org.hibernate.annotations.Entity(selectBeforeUpdate=true)
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ORDER_ID")
	int orderId;

	@Column(name = "ORDER_NAME")
	String name;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
