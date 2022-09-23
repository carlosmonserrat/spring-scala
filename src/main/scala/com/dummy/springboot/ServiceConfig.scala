package com.dummy.springboot

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

import scala.beans.BeanProperty

@Component
@ConfigurationProperties(prefix="service-config")
case class ServiceConfig() {
  @BeanProperty
  var someKey: String = _
}

