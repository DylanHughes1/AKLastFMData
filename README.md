# LastFM Artist Data

Módulo para recuperar información de un artista del servicio LastFM.

## Instrucciones de uso

Debe instanciarse la clase `ayds.lisboa.lastfmdata.lastfm.LastFMServiceImpl` que provee el método `getArtist(artistName: String): LastFMArtist?`
- Si encuentra un artista para el término (`artistName`) dado, devuelve una instancia de `ayds.lisboa.lastfmdata.lastfm.entities.LastFMArtist`
- Si no encuentra un artista o se produce una excepción, devuelve `null`.

La entidad `LastFMArtist` cuenta con las propiedades:
- `name: String`: nombre del artista buscado,
- `description: String`: biografía del artista,
- `infoUrl: String`: url a la biografía del artista en LastFM,
`sourceLogoUrl: String`: logo de LastFM
