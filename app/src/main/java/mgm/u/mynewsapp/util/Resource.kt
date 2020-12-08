package mgm.u.mynewsapp.util

import com.bumptech.glide.load.engine.Resource

sealed class Resource<T>(
    val data: T? = null,
    val message: String? = null
) {
    class Success<T>(data: T) : mgm.u.mynewsapp.util.Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : mgm.u.mynewsapp.util.Resource<T>(data, message)
    class Loading<T> : mgm.u.mynewsapp.util.Resource<T>()
}