package com.tide.ami.service;

import java.util.List;

import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import com.tide.ami.entity.TestEntity;
import com.tide.ami.repository.TestRepository;

import lombok.RequiredArgsConstructor;

@Service
@EnableAsync
@RequiredArgsConstructor
public class TestService {

	private final TestRepository testRepository;

	/**
	 * 게시판 조회
	 * @return List<Board>
	 */
	public List<TestEntity> getBoardList(){
		return testRepository.findAll();
	}
}
