package com.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "B2C_PRDCT")
public class Product {
	@Id
	private Integer id;
	private String name;
	private Integer quantity;
	private String size;

	@Column(name = "BRND_ID")
	private Integer brandId;

	@Column(name = "CLR_ID")
	private Integer colorId;

	@Column(name = "PRDCT_CTGR_ID")
	private Integer catagoryId;

	@JsonIgnoreProperties("products")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(insertable = false, updatable = false, name = "BRND_ID")
	private Brand brand;
	
	@JsonIgnoreProperties("products")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(insertable = false, updatable = false, name = "CLR_ID")
	private Color color;
	
	@JsonIgnoreProperties("products")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(insertable = false, updatable = false, name = "PRDCT_CTGR_ID")
	private ProductCategory productCategory;
}
