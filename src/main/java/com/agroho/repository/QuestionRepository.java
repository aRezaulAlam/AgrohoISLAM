package com.agroho.repository;

import com.agroho.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by AKM Rezaul Alam on 6/30/17.
 * Email: contact@rezaul.me
 * URL: rezaul.me
 */
@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
