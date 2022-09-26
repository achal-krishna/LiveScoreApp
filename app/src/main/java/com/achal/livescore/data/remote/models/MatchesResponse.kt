package com.achal.livescore.data.remote.models

data class MatchesResponse(
    val `data`: List<Data>,
    val query: Query
)