package com.yospig.graphqlkotlindemo.resolver

import com.yospig.graphqlkotlindemo.models.Organization
import com.yospig.graphqlkotlindemo.models.User
import com.yospig.graphqlkotlindemo.repositories.OrganizationRepo
import graphql.kickstart.tools.GraphQLResolver
import org.springframework.stereotype.Component

@Component
class UserResolver: GraphQLResolver<User> {
    val organizationRepo = OrganizationRepo()
    fun getOrganizations(user: User): List<Organization>{
        return organizationRepo.findByUserId(user.id)
    }
}