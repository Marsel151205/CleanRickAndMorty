package com.marsel.presentation.ui.fragments.characters

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.marsel.domain.usecases.CharacterUseCase
import com.marsel.presentation.modelsUI.CharacterModelUI
import com.marsel.presentation.tools.UIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor(
    private val characterUseCase: CharacterUseCase
) : ViewModel() {

    private val _character = MutableStateFlow<UIState<CharacterModelUI>>(UIState.Loading())
    val character = _character.asStateFlow()

    fun fetchCharacter() {
        viewModelScope.launch {
            characterUseCase.invoke().collect{}
        }
    }
}