package kr.ac.kumoh.s20230358.w24wBackendMongoDB.controller

import kr.ac.kumoh.s20230358.w24wBackendMongoDB.model.Song
import kr.ac.kumoh.s20230358.w24wBackendMongoDB.service.SongService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/songs")
class SongController(private val service: SongService) {
    @PostMapping
    fun addSong(@RequestBody song: Song): Song = service.addSong(song)

    @GetMapping
    fun getAllSongs(): List<Song> = service.getAllSongs()

    @GetMapping("/{id}")
    fun getSongById(@PathVariable id: String): Song? = service.getSongById(id)

    @GetMapping("/singer/{singer}")
    fun getSongBySinger(@PathVariable singer: String): List<Song> = service.getSongBySinger(singer)

    @PutMapping("/{id}")
    fun updateSong(@PathVariable id: String, @RequestBody songDetails: Song): Song? =  service.updateSong(id, songDetails)

    @DeleteMapping("/{id}")
    fun deleteSong(@PathVariable id: String): Map<String, String> {
        return if (service.deleteSong(id))
            mapOf("status" to "deleted")
        else
            mapOf("status" to "not found")
    }
}