package com.mercadaopocos.mercadao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mercadaopocos.mercadao.entities.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long>{

}
