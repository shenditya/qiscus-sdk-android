/*
 * Copyright (c) 2016 Qiscus.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.qiscus.sdk.chat.data.local.util

import android.webkit.MimeTypeMap
import com.qiscus.sdk.chat.data.util.MimeTypeGuesser
import com.qiscus.sdk.chat.domain.util.getAttachmentName
import com.qiscus.sdk.chat.domain.util.getExtension
import java.io.File

/**
 * Created on : September 26, 2017
 * Author     : zetbaitsu
 * Name       : Zetra
 * GitHub     : https://github.com/zetbaitsu
 */
class MimeTypeGuesserImpl: MimeTypeGuesser {
    override fun getMimeTypeFromFile(file: File): String? {
        return getMimeTypeFromFileName(file.name)
    }

    override fun getMimeTypeFromFileUrl(fileUrl: String): String? {
        return getMimeTypeFromFileName(fileUrl.getAttachmentName())
    }

    override fun getMimeTypeFromFileName(fileName: String): String? {
        return getMimeTypeFromExtension(fileName.getExtension())
    }

    override fun getMimeTypeFromExtension(extension: String): String? {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(extension)
    }
}