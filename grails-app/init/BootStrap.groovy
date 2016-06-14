import al.brut.Author
import al.brut.Book
import org.hibernate.HibernateException
import grails.util.Environment

class BootStrap {

    def init = { servletContext ->
        switch (Environment.current) {
            case Environment.DEVELOPMENT:
                try {

                    new Author (name:"Stephen King").save(failOnError: true)
                    new Author (name:"Ken Follet").save(failOnError: true)

                    new Book (title:"KF 1").save(failOnError: true)
                    new Book (title:"KF 2").save(failOnError: true)


                }catch (HibernateException h){
                    log.error(h.getLocalizedMessage())
                }catch (Exception e){
                    log.error (e.getLocalizedMessage())
                }


                break
            case Environment.PRODUCTION:

                break
        }
    }
    def destroy = {
    }
}
