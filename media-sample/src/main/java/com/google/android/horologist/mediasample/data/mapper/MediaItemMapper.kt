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

package com.google.android.horologist.mediasample.data.mapper

import com.google.android.horologist.media.model.MediaItem
import com.google.android.horologist.mediasample.data.api.model.MusicApiModel

/**
 * Maps a [MusicApiModel] into [MediaItem].
 */
object MediaItemMapper {

    fun map(musicApiModel: MusicApiModel): MediaItem = MediaItem(
        id = musicApiModel.id,
        uri = musicApiModel.source,
        title = musicApiModel.title,
        artist = musicApiModel.artist,
        artworkUri = musicApiModel.image
    )

    fun map(musicApiModels: List<MusicApiModel>): List<MediaItem> = musicApiModels.map(::map)
}
