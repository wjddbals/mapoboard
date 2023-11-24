package com.example.mapoboard.controller;

import com.example.mapoboard.entity.Board;
import com.example.mapoboard.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Boardcontroller {

    @Autowired private BoardService boardService;

  @PostMapping("/post")
    public String createBoard(@RequestParam String title , String content){

        if(boardService.create(title, content) >0) {
            return "성공";
        }else{
            return "실패";
        }


    }
    @GetMapping("/post")
    public List<Board> getAllBoard(){
        boardService.getAllBoard();

      return  boardService.getAllBoard();
    }

    @GetMapping("/post/{id}")
    public Optional<Board> getBoard(Long id){

      return boardService.getBoard(id);
    }


}
