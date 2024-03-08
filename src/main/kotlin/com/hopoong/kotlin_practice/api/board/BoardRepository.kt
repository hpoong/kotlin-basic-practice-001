package com.hopoong.kotlin_practice.api.board

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BoardRepository: JpaRepository<BoardEntity, Long> {
}