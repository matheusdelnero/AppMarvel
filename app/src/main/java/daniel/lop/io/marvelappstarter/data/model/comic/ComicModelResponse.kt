package daniel.lop.io.marvelappstarter.data.model.comic

import com.google.gson.annotations.SerializedName

data class ComicModelResponse(
    @SerializedName("data")
    val data: ComicModelData
): java.io.Serializable
