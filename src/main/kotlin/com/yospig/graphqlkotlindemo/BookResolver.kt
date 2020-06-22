package com.yospig.graphqlkotlindemo

import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class BookResolver(): GraphQLQueryResolver {
    fun books(): List<Book> {
        val book1 = Book("1","name10")
        val book2 = Book("2","name20")
        return listOf(book1,book2)
    }
}