// aliasing
import static Integer.MAX_VALUE as MAX_INT
import static Long.MAX_VALUE as MAX_LONG
import org.neis.hack.groovy.pkg.Twice as OriginalTwice

assert MAX_INT == Integer.MAX_VALUE
assert MAX_LONG == Long.MAX_VALUE

class Twice extends OriginalTwice {
    int doubleInt(int i) {
        i * 2 // fix wrong implementation
    }
}

def twice = new Twice()
twice.doubleInt(1) // no need to change this code


