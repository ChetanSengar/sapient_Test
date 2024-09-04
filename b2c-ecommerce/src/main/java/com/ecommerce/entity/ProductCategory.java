package com.ecommerce.entity;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@Entity
@Table(name="B2C_PRDCT_CTGR")
public class ProductCategory {
	@Id
	private Integer id;
	private String name;
	
	@JsonIgnoreProperties("productCategory")
	@OneToMany(mappedBy = "productCategory", fetch = FetchType.LAZY)
	private Set<Product> products;
}