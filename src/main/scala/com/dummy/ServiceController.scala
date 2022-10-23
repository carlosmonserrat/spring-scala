package com.dummy

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, ResponseBody}

@Controller
class ServiceController @Autowired()(myService: SomeService) {
  @RequestMapping(path = Array("/test"), method = Array(RequestMethod.GET), produces = Array(MediaType.TEXT_PLAIN_VALUE))
  @ResponseBody
  def handleRequest(): String = {
    "Hallo from a Scala controller! " + myService.getMessage
  }

  @RequestMapping(path = Array("/"), method = Array(RequestMethod.GET))
  def handleRoot(model: Model): String = {
    model.addAttribute("name", "ANAME!")
    "another"
  }

  @RequestMapping(path = Array("/sample"), method = Array(RequestMethod.GET), produces = Array(MediaType.TEXT_HTML_VALUE))
  def handleSample(): String = {
    "sample"
  }
}