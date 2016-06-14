package al.brut

class Book {
    String title

    static belongsTo = Author
    static hasMany = [authors: Author]

    String toString() {
        return title
    }
    static constraints = {
        title blank: false, nullable: false
    }

}
