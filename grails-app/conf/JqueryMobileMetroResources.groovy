modules = {

    'jquery-mobile-metro' {
        dependsOn 'jquery-mobile'
        resource url:[plugin: 'jquery-mobile', dir: 'css', file: 'jquery.mobile-1.1.0.css'], disposition: 'head'
        resource url:[plugin: 'jquery-mobile', dir: 'js', file: 'jquery.mobile-1.1.0.js'], disposition: 'head'
    }
}
