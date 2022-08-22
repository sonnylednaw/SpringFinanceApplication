package com.finances.financeapplication.finance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FinanceRepository extends JpaRepository<Finance, Long> {

    @Query("SELECT f FROM Finance f where f.id = ?1")
    Optional<Finance> findFinanceByIdIs(Long id);

}
