package com.yospig.graphqlkotlindemo.repositories

import com.yospig.graphqlkotlindemo.models.Book

class BookRepo {
    fun findAll(): MutableList<Book> {
        var books: MutableList<Book> = mutableListOf()
        books.add(Book(
            "1",
            "name10"
        ))
        books.add(Book(
            "2",
            "name20"
        ))
        books.add(Book(
            "3",
            "name30"
        ))
        books.add(Book(
            "4",
            "name40"
        ))
        books.add(Book(
            "5",
            "name50"
        ))
        return books
    }

    fun getBookById(id: String): Book {
        return Book(
            id, "bookName$id"
        )
    }
}