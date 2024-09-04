package com.ecommerce.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "B2C_BRND")
public class Brand {
	@Id
	private Integer id;
	private String name;

	@JsonIgnoreProperties("brand")
	@OneToMany(mappedBy = "brand", fetch = FetchType.LAZY)
	private Set<Product> products;

}
