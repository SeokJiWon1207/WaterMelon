package com.example.watermelon.music

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {
    @GET("v3/6876e100-62a8-4533-a9cb-9fda0473587d")
    fun listMusics() : Call<MusicDto>
}