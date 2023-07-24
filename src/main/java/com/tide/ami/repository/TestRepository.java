package com.tide.ami.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tide.ami.entity.TestEntity;

public interface TestRepository extends JpaRepository<TestEntity, Integer> {
}
