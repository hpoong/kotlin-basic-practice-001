package com.hopoong.kotlin_practice.api.board

import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepository: JpaRepository<BoardEntity, Long> {
}