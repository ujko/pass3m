package pl.ujo.pass3m.dao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import pl.ujo.pass3m.model.Sentence

@Repository
interface SentenceDao: JpaRepository<Sentence, Int> {
}