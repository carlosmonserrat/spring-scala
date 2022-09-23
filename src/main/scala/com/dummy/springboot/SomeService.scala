package com.dummy.springboot

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SomeService @Autowired()(serviceConfig: ServiceConfig) {
  def getMessage: String = {
    s"The service says: '${serviceConfig.someKey}'"
  }
}
