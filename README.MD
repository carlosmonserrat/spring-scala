A simple setup for getting a response when GET request /test


Project supporting scala 2.13.1

**Notes**
- Its fine to run revolver with this project, this still provides the benefits of hot reload
- Its really important to create the main class under some package inside the scala usual package, for example src/main/scala/something/main.scala, this was really confusing but is vital for the spring boot framework in order to have all the benefits of the autowired
- I was following this repository example https://github.com/bjoernjacobs/spring-boot-scala which provides a good base, my example is smaller since i didnt want to deal in configuration for the native image package
- I found several posts with the question how to use spring and all its benefits in a scala project (https://stackoverflow.com/questions/8344224/how-to-use-spring-autowired-or-manually-wired-in-scala-object), well for now I think this might be the way
- If you are working with Intellij and start to have some really annoying notification "Spring Boot Configuration Annotation Processor not configured" is fine, you can just ignore it or in settings search for spring and 'Languages & Frameworks/Spring/SPring Boot/Show notification panel in  configuration metadata files' I didnt manage to fix this, but its fine, the config should work fine after compiling
-  Spring boot can handle simultaneously requests! If your servlet container is tomcat under the hood, it can handle 200 simultaneous requests. https://stackoverflow.com/questions/46893237/can-spring-boot-application-handle-multiple-requests-simultaneously#46893548
