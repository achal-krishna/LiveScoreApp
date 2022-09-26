package com.achal.livescore.viewmodel.state

import com.achal.livescore.data.remote.models.Data

sealed class MatchesState {
    object Empty : MatchesState()
    object Loading : MatchesState()
    class Success(val data: List<Data>) : MatchesState()
    class Error(val message: String) : MatchesState()
}
