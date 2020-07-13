package com.yospig.graphqlkotlindemo.repositories

import com.yospig.graphqlkotlindemo.models.Organization

class OrganizationRepo {
    fun findByUserId(userId: String): MutableList<Organization> {
        var organizations: MutableList<Organization> = mutableListOf()
        organizations.add(Organization(
            "1",
            "1",
            "00001",
            "情報システム部"
        ))
        organizations.add(Organization(
            "2",
            "1",
            "00002",
            "クラウドサービス部"
        ))
        organizations.add(Organization(
            "3",
            "1",
            "00003",
            "新規事業部"
        ))
        return organizations
    }
}