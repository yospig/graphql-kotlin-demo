package com.yospig.graphqlkotlindemo.queryResolver

import com.yospig.graphqlkotlindemo.models.Organization
import com.yospig.graphqlkotlindemo.models.User
import com.yospig.graphqlkotlindemo.repositories.OrganizationRepo
import com.yospig.graphqlkotlindemo.repositories.UserRepo
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class UserQueryResolver(): GraphQLQueryResolver {
    val userRepo = UserRepo()
    fun getUsers(): List<User> {
        return userRepo.findAll()
    }
}