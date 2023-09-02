package com.example.kotlinspringblog.configuration

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * @author Girdhar Singh Rathore
 * @date Saturday, September 02, 2023, 8:13 PM
 */
@ConfigurationProperties("blog")
data class BlogProperties(var title: String, val banner: Banner) {
    data class Banner(val title: String? = null, val content: String)
}
