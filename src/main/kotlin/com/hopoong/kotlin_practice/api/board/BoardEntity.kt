package com.hopoong.kotlin_practice.api.board

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

//@Entity
//@Table(name = "acc_board")
//class BoardEntity (
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    var id: Long? = null,
//    var writer: String?,
//    var password: String?,
//    var title: String?,
//    var content: String?
//) {
//    fun updatePost(boardDto: BoardDto) {
//        writer = boardDto.writer
//        password = boardDto.password
//        title = boardDto.title
//        content = boardDto.content
//    }
//}


@Entity
@Table(name = "acc_board")
class BoardEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var writer: String? = null,
    var password: String? = null,
    var title: String? = null,
    var content: String? = null
) {
    fun updatePost(boardDto: BoardDto) {
        writer = boardDto.writer
        password = boardDto.password
        title = boardDto.title
        content = boardDto.content
    }
}