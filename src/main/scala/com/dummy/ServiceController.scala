package com.dummy

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{RequestAttribute, RequestBody, RequestMapping, RequestMethod, RequestParam, ResponseBody}

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
    "index"
  }

  @RequestMapping(path = Array("/hey"), method = Array(RequestMethod.POST))
  @ResponseBody
  def handleSample(@RequestParam("name")  response:String): String = {
    "response: "+response
  }
}