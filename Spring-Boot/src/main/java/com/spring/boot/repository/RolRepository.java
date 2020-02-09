package com.spring.boot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.entity.Rol;

@Repository
public interface RolRepository extends CrudRepository<Rol, Long> {

}
