class JqueryMobileMetroGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3.7 > *"
    // the other plugins this plugin depends on
    def dependsOn = ['resources':'1.0 > *', 'jquery-mobile':'1.1 > *']

    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    def author = "Zach Lendon"
    def authorEmail = "zach.lendon@gmail.com"
    def title = "Plugin jQuery mobile framework metro theme resource files"
    def description = 'Plugin jQuery mobile framework metro theme resource files. To get started -- checkout http://jquerymobile.com/'

    // URL to the plugin's documentation
    def documentation = "https://github.com/zachlendon/jquery-mobile-metro-grails-plugin/blob/master/README.md"
    def license = "APACHE"
    def issueManagement = [ system: "github", url: "https://github.com/zachlendon/jquery-mobile-metro-grails-plugin/issues" ]
    def scm = [ url: "https://github.com/zachlendon/jquery-mobile-metro-grails-plugin" ]

}
