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
@Table(name = "B2C_CLR")
public class Color {
	@Id
	private Integer id;
	private String name;
	private String code;

	@JsonIgnoreProperties("color")
	@OneToMany(mappedBy = "color", fetch = FetchType.LAZY)
	private Set<Product> products;

}
