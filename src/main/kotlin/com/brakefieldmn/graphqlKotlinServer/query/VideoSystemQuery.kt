package com.brakefieldmn.graphqlKotlinServer.query

import com.brakefieldmn.graphqlKotlinServer.model.VideoGameSystems
import com.brakefieldmn.graphqlKotlinServer.model.XboxOneX
import com.expediagroup.graphql.annotations.GraphQLDescription
import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component

@Component
class VideoSystemQuery : Query {
    @GraphQLDescription("query to return xbox one")
    fun returnXboxOne(): VideoGameSystems {
        return XboxOneX()
    }
}