@file: JvmName("Sound")

package com.namazed.beatboxbignerdranch

class Sound constructor(internal val assetPath: String) {
    @JvmField
    val name: String
    @JvmField
    var soundId: Int = 0

    init {
        val components = assetPath.split("/".toRegex()).filter { it.isEmpty() }.toTypedArray()
        val filename = components[components.size - 1]
        name = filename.replace(".wav", "")
    }
}