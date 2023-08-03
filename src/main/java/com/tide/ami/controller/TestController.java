package com.tide.ami.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tide.ami.dto.ResultVO;
import com.tide.ami.service.BoardService;
import com.tide.ami.service.TestService;

import lombok.RequiredArgsConstructor;


@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {

	private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

	private final TestService testService;
	String[] header= {"글번호", "제목", "내용", "작성자", "등록일"};

	@RequestMapping(value = "board-list.do", method = RequestMethod.GET)
//	@GetMapping("get-board-list.do")	동일한 코드
	public ResultVO getBoardList() {
		LOG.info("[GET] API-TEST");

		ResultVO result = new ResultVO(false, null);

		try {
			result.setResult(testService.getBoardList());
			result.setSuccess(true);
		} catch (Exception e) {
			LOG.error("[TEST] API TEST : " + e.getMessage(), e);
		}

		return result;
	}
	
	
}
