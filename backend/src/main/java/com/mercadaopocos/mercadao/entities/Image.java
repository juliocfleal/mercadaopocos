package com.mercadaopocos.mercadao.entities;

import java.util.Objects;

import com.mercadaopocos.mercadao.entities.enums.Section;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_image")
public class Image {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String way;
	
	@ManyToOne
	@JoinColumn(name = "store_id")
	private Store store;

	public Image(Long id, String way) {
		super();
		this.id = id;
		this.way = way;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Image other = (Image) obj;
		return Objects.equals(id, other.id);
	}

}
