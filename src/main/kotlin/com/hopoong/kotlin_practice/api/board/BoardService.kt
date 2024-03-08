package com.hopoong.kotlin_practice.api.board

import org.modelmapper.ModelMapper
import org.modelmapper.TypeMap
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BoardService @Autowired constructor(
    val boardRepository: BoardRepository,
    val modelMapper: ModelMapper
){


    /*
     * 저장
     */
    fun save(boardDto: BoardDto): BoardEntity {
        return boardRepository.save(boardDto.toEntity())
    }

    /*
     * 수정
     */
    fun update(id: Long, boardDto: BoardDto): BoardEntity {
        val post = boardRepository.findById(id).get()
        post.updatePost(boardDto)
        return boardRepository.save(post)
    }

    /*
     * 삭제
     */
    fun delete(id: Long): Boolean {
        boardRepository.deleteById(id)
        return true
    }


    fun BoardDto.toEntity(): BoardEntity {
        return BoardEntity(
            writer = this.writer,
            password = this.password,
            title = this.title,
            content = this.content
        )
    }



}