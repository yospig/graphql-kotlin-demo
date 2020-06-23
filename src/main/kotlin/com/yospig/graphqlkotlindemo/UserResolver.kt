package com.yospig.graphqlkotlindemo

import com.yospig.graphqlkotlindemo.models.User
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class UserResolver(): GraphQLQueryResolver {
    fun users(): List<User> {
        val user1 = User(
            "石丸洋介",
            "洋介",
            "石丸",
            "5598",
            "hotaquariusplus@gmail.com",
            "yishimaru",
            "yospig"
        )
        return listOf(user1)
    }
}