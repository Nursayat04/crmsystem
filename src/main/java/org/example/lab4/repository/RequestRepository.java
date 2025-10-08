package org.example.lab4.repository;

import org.example.lab4.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {

    List<Request> findAllByOrderByIdDesc();

    List<Request> findByHandledFalseOrderByIdDesc();

    List<Request> findByHandledTrueOrderByIdDesc();
}