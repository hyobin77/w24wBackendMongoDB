package kr.ac.kumoh.s20230358.w24wBackendMongoDB.repository

import kr.ac.kumoh.s20230358.w24wBackendMongoDB.model.Song
import org.springframework.data.mongodb.repository.MongoRepository

interface SongRepository : MongoRepository<Song,String> {
    fun findBySinger(singer: String): List<Song>
}