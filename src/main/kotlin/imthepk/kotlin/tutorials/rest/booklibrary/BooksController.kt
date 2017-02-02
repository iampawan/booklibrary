package imthepk.kotlin.tutorials.rest.booklibrary

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by pawankumar on 02/02/17.
 */

@RestController
        class BooksController{

    @Autowired
    private lateinit var database: BookDatabase

    @RequestMapping("", method = arrayOf(RequestMethod.GET))
    fun books() = database.getBooks()

    @RequestMapping("", method = arrayOf(RequestMethod.POST))
    fun addBook(@RequestBody book: Book) =
            if (database.addBook(book)) book
            else throw DuplicateItemException()
}