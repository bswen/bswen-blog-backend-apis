package com.example.web

import com.example.domain.Message
import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.client.RestTemplate
import java.awt.print.Book




@SpringBootApplication
class BlogApplication

fun main(args: Array<String>) {
	runApplication<BlogApplication>(*args)

	//test1()
}

fun test1() {
//	var result = RestTemplate().getForObject("http://localhost:8081/msg/", ArrayList::class.java)
//	println(result)
//
	val mapper = ObjectMapper()
	val msgstr:String? =
		RestTemplate().getForObject("http://localhost:8081/msg/", String::class.java)
	val msgs: List<Message> = mapper.readValue(msgstr, object : TypeReference<List<Message>>() {})
	if(msgs!=null) {
		println("got ${msgs.size} messages as follows:")
		for (msg in msgs) {
			println(msg)
		}
	}
}
