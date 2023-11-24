package com.example.mapoboard.service;

import com.example.mapoboard.entity.Board;
import com.example.mapoboard.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardService {
    @Autowired private BoardRepository boardRepository;
    public int create(String title, String content) {

        Board board = new Board(title, content);

        Board savedBoard = boardRepository.save(board);
        System.out.println("저장값" + savedBoard.getContent().toString());

        if (savedBoard != null){
            return 1;
    }
        return 0;


    }
  public List<Board> getAllBoard(){
       List<Board> boardlist =boardRepository.findAll();

        return boardlist;

  }
public  Optional<Board> getBoard(Long id){
        Optional<Board> board=boardRepository.findById(id);
        return board;
}

}
