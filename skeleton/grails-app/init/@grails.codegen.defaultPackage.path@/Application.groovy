package @grails.codegen.defaultPackage@

import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import groovy.transform.CompileStatic

@CompileStatic
@EnableAutoConfiguration(exclude=[JtaAutoConfiguration])
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }
}