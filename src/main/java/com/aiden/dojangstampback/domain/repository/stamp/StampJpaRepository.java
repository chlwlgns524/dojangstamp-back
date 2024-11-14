package com.aiden.dojangstampback.domain.repository.stamp;

import com.aiden.dojangstampback.domain.entity.Stamp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StampJpaRepository extends JpaRepository<Stamp, Long> {
}
