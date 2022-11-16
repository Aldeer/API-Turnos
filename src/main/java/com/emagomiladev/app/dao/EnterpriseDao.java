package com.emagomiladev.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emagomiladev.app.entities.Enterprise;

@Repository
public interface EnterpriseDao extends JpaRepository<Enterprise, Long>{

}
