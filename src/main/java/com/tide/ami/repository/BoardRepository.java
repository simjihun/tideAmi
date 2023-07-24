package com.tide.ami.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tide.ami.entity.BoardEntity;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
	
	Page<BoardEntity> findAllByOrderByIdxDesc(Pageable pageable);
	
}
