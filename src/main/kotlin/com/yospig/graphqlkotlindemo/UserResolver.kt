package com.yospig.graphqlkotlindemo

import com.yospig.graphqlkotlindemo.models.Organization
import com.yospig.graphqlkotlindemo.models.User
import com.yospig.graphqlkotlindemo.repositories.OrganizationRepo
import com.yospig.graphqlkotlindemo.repositories.UserRepo
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class UserResolver(): GraphQLQueryResolver {
    val userRepo = UserRepo()
    fun getUsers(): List<User> {
        return userRepo.findAll()
    }
    fun organizations(user: User): List<Organization>{
        val organizationRepo = OrganizationRepo()
        return organizationRepo.findByUserId(user.id)
    }
}