package com.example.kotlinspringblog.configuration

import com.example.kotlinspringblog.entity.Article
import com.example.kotlinspringblog.entity.User
import com.example.kotlinspringblog.repository.ArticleRepository
import com.example.kotlinspringblog.repository.UserRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @author Girdhar Singh Rathore
 * @date Saturday, September 02, 2023, 12:51 AM
 */
@Configuration
class BlogConfiguration {
    @Bean
    fun databaseInitializer(
        userRepository: UserRepository,
        articleRepository: ArticleRepository
    ) = ApplicationRunner {

        println("initializing database......")
        val johnDoe = userRepository.save(User("johnDoe", "John", "Doe"))
        articleRepository.save(
            Article(
                title = "Lorem",
                headline = "Lorem",
                content = "dolor sit amet",
                author = johnDoe
            )
        )
        articleRepository.save(
            Article(
                title = "Ipsum",
                headline = "Ipsum",
                content = "dolor sit amet",
                author = johnDoe
            )
        )
    }
}