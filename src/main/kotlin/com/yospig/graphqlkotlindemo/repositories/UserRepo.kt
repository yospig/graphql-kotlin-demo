package com.yospig.graphqlkotlindemo.repositories

import com.yospig.graphqlkotlindemo.models.User

class UserRepo {
    fun findAll(): MutableList<User> {
        var users: MutableList<User> = mutableListOf()
        users.add(User(
            "1",
            "鈴木太郎",
            "太郎",
            "鈴木",
            30,
            "1000",
            "tarosuzuki@example.com"
        ))
        users.add(User(
            "2",
            "田中一郎",
            "一郎",
            "田中",
            25,
            "2000",
            "ichirotanaka@example.com"
        ))
        return users
    }
}