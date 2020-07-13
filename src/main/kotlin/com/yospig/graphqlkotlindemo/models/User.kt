package com.yospig.graphqlkotlindemo.models

data class User(
    val id: String,
    val full_name: String,
    val first_name: String,
    val last_name: String,
    val age: Int,
    val employee_number: String,
    val email: String
)
