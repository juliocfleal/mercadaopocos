package com.mercadaopocos.mercadao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mercadaopocos.mercadao.entities.Alert;

@Repository
public interface AlertRepository extends JpaRepository<Alert, Long>{

}
