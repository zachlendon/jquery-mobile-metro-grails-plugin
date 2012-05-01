modules = {

    'jquery-mobile-metro' {
        dependsOn 'jquery-mobile'
        resource url:[plugin: 'jquery-mobile-metro', dir: 'css', file: 'jquery.mobile.metro.theme.css'], disposition: 'head'
        resource url:[plugin: 'jquery-mobile-metro', dir: 'js', file: 'jquery.mobile.metro.theme.init.js'], disposition: 'head'
    }
}
