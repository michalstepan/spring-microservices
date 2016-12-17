package com.stepan.services.pokladna.repository;

import com.stepan.services.pokladna.model.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Michal on 17.12.2016.
 */
@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, Integer> {
}
