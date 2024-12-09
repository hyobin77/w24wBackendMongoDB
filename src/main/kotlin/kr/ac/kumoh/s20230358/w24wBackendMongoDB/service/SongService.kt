package kr.ac.kumoh.s20230358.w24wBackendMongoDB.service

import kr.ac.kumoh.s20230358.w24wBackendMongoDB.model.Song
import kr.ac.kumoh.s20230358.w24wBackendMongoDB.repository.SongRepository
import org.springframework.stereotype.Service

@Service
class SongService(private val repository: SongRepository) {
    fun getAllSongs(): List<Song> = repository.findAll()
}