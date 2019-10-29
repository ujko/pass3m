package pl.ujo.pass3m.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import pl.ujo.pass3m.model.Sentence
import pl.ujo.pass3m.service.SentenceService

@Controller
class ServiceController(val service: SentenceService) {

    @RequestMapping("/allSentences")
    fun getTest(model:Model):String{
        model.addAttribute("sentences", service.getAllSentences())
        return "allSentences"
    }

}