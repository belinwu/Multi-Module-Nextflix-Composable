package com.talhafaki.popular

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by tfakioglu on 12.December.2021
 */
@HiltViewModel
class PopularViewModel @Inject constructor(
    private val popularRepository: PopularRepository,
) : ViewModel() {

    val popularList = popularRepository.popular().cachedIn(viewModelScope)
}
