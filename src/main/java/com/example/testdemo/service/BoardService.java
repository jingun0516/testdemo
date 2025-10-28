package com.example.testdemo.service;

import com.example.testdemo.entity.Board;

public interface BoardService {
    Board getById(Long id);
    Board save(Board user);
    Board update(Long id, Board newBoard);
    void delete(Long id);
}
