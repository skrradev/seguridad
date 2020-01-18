package com.zhanarys.seguridad.repository;

import com.zhanarys.seguridad.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zh.turemuratov on 1/17/20
 */
public interface CardRepository extends JpaRepository<Card, Long> {
}
