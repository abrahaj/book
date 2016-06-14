package al.brut

class Author {
    String name
    static hasMany = [books: Book]

    String toString() {
        return name
    }
    static constraints = {
        name blank: false, nullable: false
    }
}
