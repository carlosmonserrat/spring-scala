A simple setup for getting a response when GET request /test
The same uses scala 2.13.1

**Notes**
- Its fine to run revolver with this project, this still provides the benefits of hot reload
- Its really important to create the main class under some package inside the scala usual package, for example src/main/scala/something/main.scala, this was really confusing but is vital for the spring boot framework in order to have all the benefits of the autowired
- I was following this repository example https://github.com/bjoernjacobs/spring-boot-scala which provides a good base, my example is smaller since i didnt want to deal in configuration for the native image package
- I found several posts with the question how to use spring and all its benefits in a scala project (https://stackoverflow.com/questions/8344224/how-to-use-spring-autowired-or-manually-wired-in-scala-object), well for now I think this might be the way
