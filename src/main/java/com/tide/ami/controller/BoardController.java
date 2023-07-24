package com.tide.ami.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tide.ami.dto.BoardDto;
import com.tide.ami.entity.BoardEntity;
import com.tide.ami.model.Header;
import com.tide.ami.service.BoardService;

import lombok.RequiredArgsConstructor;


@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
//@RequestMapping("/board")
public class BoardController {

	private static final Logger LOG = LoggerFactory.getLogger(BoardController.class);

	private final BoardService boardService;

    @GetMapping("/board/list")
    public Header<List<BoardDto>> boardList(@PageableDefault(sort = {"idx"}) Pageable pageable){
        return boardService.getBoardList(pageable);
    }

    @GetMapping("/board/{id}")
    public BoardDto getBoard(@PathVariable Long id) {
        return boardService.getBoard(id);
    }

    @PostMapping("/board")
    public BoardEntity create(@RequestBody BoardDto boardDto) {
        return boardService.create(boardDto);
    }

    @PatchMapping("/board")
    public BoardEntity update(@RequestBody BoardDto boardDto) {
        return boardService.update(boardDto);
    }

    @DeleteMapping("/board/{id}")
    public void delete(@PathVariable Long id) {
        boardService.delete(id);
    }
}
