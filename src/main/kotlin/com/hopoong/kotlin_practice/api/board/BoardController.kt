package com.hopoong.kotlin_practice.api.board

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("board")
class BoardController @Autowired constructor(
    val boardService: BoardService
){

    @PostMapping
    fun addPost(@RequestBody boardDto: BoardDto): ResponseEntity<Any> {
        println(boardDto.toString())
        return ResponseEntity.ok().body(boardService.save(boardDto));
    }

    @PutMapping("/{id}")
    fun updatePost(
        @PathVariable(required = true) id: Long,
        @RequestBody boardDto: BoardDto): ResponseEntity<Any> {
        return ResponseEntity.ok().body(boardService.update(id, boardDto));
    }


    @DeleteMapping("/{id}")
    fun deletePost(@PathVariable(required = true) id: Long): ResponseEntity<Any> {
        return ResponseEntity.ok().body(boardService.delete(id))
    }



}