package br.com.digitalhousefoods.domain

import java.io.Serializable

data class Prato(
    val id: Int,
    val nome: String,
    val descricao: String,
    val imagem: Int
) :
    Serializable
