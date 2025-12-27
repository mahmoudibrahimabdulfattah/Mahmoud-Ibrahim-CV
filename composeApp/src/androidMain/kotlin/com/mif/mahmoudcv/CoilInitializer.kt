package com.mif.mahmoudcv

import android.content.Context
import androidx.startup.Initializer
import coil3.ImageLoader
import coil3.SingletonImageLoader
import coil3.disk.DiskCache
import coil3.disk.directory
import coil3.memory.MemoryCache
import coil3.request.crossfade

/**
 * Deferred Coil initialization using App Startup.
 * This delays Coil initialization until after the splash screen,
 * improving cold start time significantly.
 */
class CoilInitializer : Initializer<ImageLoader> {

    override fun create(context: Context): ImageLoader {
        val imageLoader: ImageLoader = ImageLoader.Builder(context)
            .crossfade(true)
            .memoryCache {
                MemoryCache.Builder()
                    .maxSizePercent(context, 0.25)
                    .build()
            }
            .diskCache {
                DiskCache.Builder()
                    .directory(context.cacheDir.resolve("image_cache"))
                    .maxSizePercent(0.02)
                    .build()
            }
            .build()
        SingletonImageLoader.setSafe { imageLoader }
        return imageLoader
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        // No dependencies - initialize as early as possible after app starts
        return emptyList()
    }
}

