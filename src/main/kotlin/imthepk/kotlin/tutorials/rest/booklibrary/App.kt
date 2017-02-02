package imthepk.kotlin.tutorials.rest.booklibrary

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by pawankumar on 02/02/17.
 */

@SpringBootApplication
open class App{

}

fun main(args: Array<String>) {
    SpringApplication.run(App::class.java,*args)
}