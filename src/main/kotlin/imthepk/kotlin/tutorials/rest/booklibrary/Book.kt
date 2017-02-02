package imthepk.kotlin.tutorials.rest.booklibrary

/**
 * Created by pawankumar on 02/02/17.
 */
class Book(){
    lateinit var ISBN : String
    lateinit var title: String
    lateinit var author: String
    var coverURL: String? = null

    constructor(
            ISBN: String,
            title: String,
            author: String,
            coverURL: String? = null): this() {

        this.ISBN = ISBN
        this.title = title
        this.author = author
        this.coverURL = coverURL
    }

}