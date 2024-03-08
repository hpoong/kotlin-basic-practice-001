package com.hopoong.kotlin_practice.api.board

data class BoardDto(
    var writer: String?,
    var password: String?,
    var title: String?,
    var content: String?
) {

}