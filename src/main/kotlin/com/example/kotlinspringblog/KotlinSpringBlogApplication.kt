package com.example.kotlinspringblog

import com.example.kotlinspringblog.configuration.BlogProperties
import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class KotlinSpringBlogApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringBlogApplication>(*args){
        setBannerMode(Banner.Mode.OFF)
    }
}
