package com.mercadaopocos.mercadao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mercadaopocos.mercadao.entities.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long>{

}
