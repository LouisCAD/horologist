/*
 * Copyright 2022 The Android Open Source Project
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

package com.google.android.horologist.mediasample.data.api.model

import com.google.android.horologist.media.model.MediaItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MusicApiModel(
    val album: String,
    val artist: String,
    val duration: Int,
    val genre: String,
    val id: String,
    val image: String,
    val site: String,
    val source: String,
    val title: String,
    val totalTrackCount: Int,
    val trackNumber: Int
) {
    fun toMediaItem() = MediaItem(
        id = id,
        uri = source,
        title = title,
        artist = artist,
        artworkUri = image,
    )
}
