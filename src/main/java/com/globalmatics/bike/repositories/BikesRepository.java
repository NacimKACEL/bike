package com.globalmatics.bike.repositories;

import com.globalmatics.bike.models.Bikes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikesRepository extends JpaRepository<Bikes, Long> {

}
