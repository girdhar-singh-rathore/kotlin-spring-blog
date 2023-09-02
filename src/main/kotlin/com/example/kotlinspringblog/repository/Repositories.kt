package com.example.kotlinspringblog.repository

import com.example.kotlinspringblog.entity.Article
import com.example.kotlinspringblog.entity.User
import org.springframework.data.repository.CrudRepository

/**
 * @author Girdhar Singh Rathore
 * @date Saturday, September 02, 2023, 12:36 AM
 */

interface ArticleRepository : CrudRepository<Article, Long> {
    fun findBySlug(slug: String): Article?
    fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}

interface UserRepository : CrudRepository<User, Long> {
    fun findByLogin(login: String): User?
}
