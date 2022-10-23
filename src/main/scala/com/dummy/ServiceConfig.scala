package com.dummy

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.{View, ViewResolver}
import org.springframework.web.servlet.view.{InternalResourceViewResolver, JstlView}

import scala.beans.BeanProperty

@Component
@ConfigurationProperties(prefix = "service-config")
case class ServiceConfig() extends WebMvcConfigurer{
  @BeanProperty
  var someKey: String = _

  @Bean
  def sample(): View = {
    new JstlView("/views/index.html")
  }
}

