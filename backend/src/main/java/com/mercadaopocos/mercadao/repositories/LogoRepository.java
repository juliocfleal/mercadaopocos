package com.mercadaopocos.mercadao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mercadaopocos.mercadao.entities.Logo;

@Repository
public interface LogoRepository extends JpaRepository<Logo, Long>{

}
