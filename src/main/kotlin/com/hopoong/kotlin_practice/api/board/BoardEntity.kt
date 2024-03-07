package com.hopoong.kotlin_practice.api.board

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "acc_board")
class BoardEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var writer: String,
    var password: String,
    var title: String,
    var content: String
) {

    fun updatePost(boardEntity: BoardEntity) {
        writer = boardEntity.writer
        password = boardEntity.password
        title = boardEntity.title
        content = boardEntity.content
    }

}