package pl.ujo.pass3m.model

import javax.persistence.*

@Entity
@Table(name = "sentence")
data class Sentence(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int,
        @Column(name = "name", nullable = false, unique = true)
        val name: String,
        @Column(name = "user")
        val user: String,
        @Column(name = "pass")
        val pass: String,
        @Column(name = "email")
        val email: String,
        @Column(name = "web_page")
        val webPage: String,
        @Column(name = "description")
        val description: String
){
    constructor() :this(0,"","","","","","")
}
