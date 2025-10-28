package com.example.testdemo.service.impl;

import com.example.testdemo.entity.Board;
import com.example.testdemo.repository.BoardRepository;
import com.example.testdemo.service.BoardService;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl extends BaseServiceImpl<Board, Long> implements BoardService {

    private final BoardRepository boardRepository;

    public BoardServiceImpl(BoardRepository boardRepository) {
        super(boardRepository);
        this.boardRepository = boardRepository;
    }

    @Override
    public Board update(Long id, Board newBoard) {

        Board board = getById(id);

        return super.save(board);
    }
}
