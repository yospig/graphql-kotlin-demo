package com.yospig.graphqlkotlindemo

import com.yospig.graphqlkotlindemo.models.Book
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class BookResolver(/* val bookRepo: BookRepository */): GraphQLQueryResolver {
    fun books(): List<Book> {
//        return bookRepo.findAll()
        var books: MutableList<Book> = mutableListOf()
        books.add(Book(
            "1",
            "name10"
        ))
        books.add(Book(
            "2",
            "name20"
        ))
        return books
    }
    fun getBookById(id: String): Book {
//        return bookRepo.findById(id)
        return Book(
            "3",
            "name30"
        )
    }
}