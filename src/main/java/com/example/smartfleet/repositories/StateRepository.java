package com.example.smartfleet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.smartfleet.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
