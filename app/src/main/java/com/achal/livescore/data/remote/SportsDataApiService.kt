package com.achal.livescore.data.remote

import com.achal.livescore.data.remote.models.MatchesResponse
import com.achal.livescore.util.API_KEY
import com.achal.livescore.util.GET_MATCHES_ENDPOINT
import com.achal.livescore.util.SEASON_ID
import retrofit2.http.GET
import retrofit2.http.Query

interface SportsDataApiService {

    @GET(GET_MATCHES_ENDPOINT)
    suspend fun getMatches(
        @Query("apikey") apiKey: String = API_KEY,
        @Query("season_id") seasonId: Int = SEASON_ID
    ): MatchesResponse

    @GET(GET_MATCHES_ENDPOINT)
    suspend fun getLiveMatches(
        @Query("apikey") apiKey: String = API_KEY,
        @Query("live") seasonId: Boolean = true
    ): MatchesResponse
}