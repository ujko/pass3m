package pl.ujo.pass3m.service

import org.springframework.stereotype.Service
import pl.ujo.pass3m.dao.SentenceDao
import pl.ujo.pass3m.model.Sentence

@Service
class SentenceService(val dao: SentenceDao) {

    fun getAllSentences(): List<Sentence> {
        return dao.findAll()
    }

}