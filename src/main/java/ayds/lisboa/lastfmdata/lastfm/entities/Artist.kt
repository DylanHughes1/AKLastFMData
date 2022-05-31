package ayds.lisboa.lastfmdata.lastfm.entities

data class LastFMArtist(
    val name: String,
    val description: String,
    val infoUrl: String,
    val sourceLogoUrl: String = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/Lastfm_logo.svg/320px-Lastfm_logo.svg.png",
)