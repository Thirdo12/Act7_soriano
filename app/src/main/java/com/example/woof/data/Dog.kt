/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

/**
 * A data class to represent the information presented in the dog card
 */
data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    Dog(R.drawable.aiah, R.string.dog_name_1, 23, R.string.dog_description_1),
    Dog(R.drawable.colet, R.string.dog_name_2, 23, R.string.dog_description_2),
    Dog(R.drawable.maloi, R.string.dog_name_3, 22, R.string.dog_description_3),
    Dog(R.drawable.jhoanna, R.string.dog_name_4, 22, R.string.dog_description_4),
    Dog(R.drawable.gwen, R.string.dog_name_5, 20, R.string.dog_description_5),
    Dog(R.drawable.mikha, R.string.dog_name_6, 21, R.string.dog_description_6),
    Dog(R.drawable.stacey, R.string.dog_name_7, 20, R.string.dog_description_7),
    Dog(R.drawable.sheena, R.string.dog_name_8, 20, R.string.dog_description_8),
    Dog(R.drawable.maloi, R.string.dog_name_9, 20, R.string.dog_description_9)
)
