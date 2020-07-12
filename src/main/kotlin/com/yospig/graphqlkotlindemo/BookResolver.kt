package com.yospig.graphqlkotlindemo

import com.yospig.graphqlkotlindemo.models.Book
import com.yospig.graphqlkotlindemo.repositories.BookRepo
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class BookResolver(val bookRepo: BookRepo): GraphQLQueryResolver {
    fun books(): List<Book> {
        return bookRepo.findAll()
    }
    fun getBookById(id: String): Book {
        return bookRepo.getBookById(id)
    }
}