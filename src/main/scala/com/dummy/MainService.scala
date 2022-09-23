package com.dummy

import com.dummy.springboot.ServiceConfig
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties

object MainService extends App {
   SpringApplication.run(classOf[MainService] )
}

@SpringBootApplication
@EnableConfigurationProperties(Array(classOf[ServiceConfig]))
class MainService

