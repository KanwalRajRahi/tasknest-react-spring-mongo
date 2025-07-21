package com.tasknest.controller;

import com.tasknest.model.Board;
import com.tasknest.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/boards")
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    @GetMapping
    public List<Board> getAllBoards() {
        return boardRepository.findAll();
    }

    @PostMapping
    public Board createBoard(@RequestBody Board board) {
        return boardRepository.save(board);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBoard(@PathVariable String id) {
        try {
            Optional<Board> board = boardRepository.findById(id);
            if (board.isPresent()) {
                boardRepository.deleteById(id);
                return ResponseEntity.ok().build();
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Error deleting board: " + e.getMessage());
        }
    }
} 