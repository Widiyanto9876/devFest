package app.isfa.devfest.data.entity

import com.arkivanov.essenty.parcelable.Parcelable
import com.arkivanov.essenty.parcelable.Parcelize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Parcelize
@Serializable
data class Chapter(
    @SerialName("banner") val banner: String,
    @SerialName("events") val events: List<Event>,
    @SerialName("link") val link: String,
    @SerialName("name") val name: String,
    @SerialName("organizers") val organizers: List<Organizer>
) : Parcelable