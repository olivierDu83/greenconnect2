package com.greentech.greenconnect2.dao;

import com.greentech.greenconnect2.entities.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VegetableRepository extends JpaRepository<Vegetable, Long> {
}
