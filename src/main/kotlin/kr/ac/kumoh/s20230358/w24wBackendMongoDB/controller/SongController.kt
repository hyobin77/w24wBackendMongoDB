package kr.ac.kumoh.s20230358.w24wBackendMongoDB.controller

import kr.ac.kumoh.s20230358.w24wBackendMongoDB.model.Song
import kr.ac.kumoh.s20230358.w24wBackendMongoDB.service.SongService
import org.springframework.web.bind.annotation.*

@RestController
class SongController(private val service: SongService) {
    @GetMapping("/api/songs")
    fun getAllSongs(): List<Song> = service.getAllSongs()
}