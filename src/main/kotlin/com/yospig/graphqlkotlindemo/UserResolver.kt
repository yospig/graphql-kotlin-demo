package com.yospig.graphqlkotlindemo

import com.yospig.graphqlkotlindemo.models.User
import com.yospig.graphqlkotlindemo.repositories.UserRepo
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class UserResolver(): GraphQLQueryResolver {
    val userRepo = UserRepo()
    fun getUsers(): List<User> {
        return userRepo.findAll()
    }
}