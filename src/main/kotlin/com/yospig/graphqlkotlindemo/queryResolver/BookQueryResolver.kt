package com.yospig.graphqlkotlindemo.queryResolver

import com.yospig.graphqlkotlindemo.models.Book
import com.yospig.graphqlkotlindemo.repositories.BookRepo
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class BookQueryResolver(): GraphQLQueryResolver {
    val bookRepo = BookRepo()
    fun getBooks(): List<Book> {
        return bookRepo.findAll()
    }
    fun getBook(id: String): Book {
        return bookRepo.getBookById(id)
    }
}