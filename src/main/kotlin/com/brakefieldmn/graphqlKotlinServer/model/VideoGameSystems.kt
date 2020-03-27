package com.brakefieldmn.graphqlKotlinServer.model

import com.expediagroup.graphql.annotations.GraphQLDescription


@GraphQLDescription("video game interface type")
interface VideoGameSystems {
    @GraphQLDescription("common field of video game systems")
    val manufacturer: SystemManufacturer

    @GraphQLDescription("common function of video game systems")
    fun consoleInfo(): String
}

@GraphQLDescription("enum holding supported video game system types")
enum class SystemManufacturer {
    NINTENDO,
    SONY,
    MICROSOFT
}

@GraphQLDescription("playstation 4 is a video game system")
class PlaystationPro: VideoGameSystems {

    override val manufacturer: SystemManufacturer
        get() = SystemManufacturer.SONY

    override fun consoleInfo(): String = "Created 2012"

}

@GraphQLDescription("xbox one x is a video game system")
class XboxOneX: VideoGameSystems {

    override val manufacturer: SystemManufacturer
        get() = SystemManufacturer.MICROSOFT

    override fun consoleInfo(): String = "Created 2013"

}

@GraphQLDescription("switch is a video game system")
class NintendoSwitch: VideoGameSystems {

    override val manufacturer: SystemManufacturer
        get() = SystemManufacturer.NINTENDO

    override fun consoleInfo(): String = "Created 2016"

}
