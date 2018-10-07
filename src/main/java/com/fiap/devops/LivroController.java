package com.fiap.devops;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @GetMapping
    public ResponseEntity<List<Livro>> getLivros() {
    	List<Livro> result = new ArrayList<>();
    	result.add(new Livro(1, "George Martin", "Game Of Thrones"));
    	result.add(new Livro(2, "George Martin", "Game Of Thrones"));
        return ResponseEntity.ok().body(result);
    }
}
