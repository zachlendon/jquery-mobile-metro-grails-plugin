modules = {

    'jquery-mobile-metro' {
        dependsOn 'jquery-mobile'
        resource url:[plugin: 'jquery-mobile-metro', dir: 'css/metro', file: 'jquery.mobile.metro.theme.css'], disposition: 'head'
        resource url:[plugin: 'jquery-mobile-metro', dir: 'css', file: 'jquery.mobile.fixedToolbar.polyfill.css'], disposition: 'head'
        resource url:[plugin: 'jquery-mobile-metro', dir: 'css', file: 'progress-bar.css'], disposition: 'head'
        resource url:[plugin: 'jquery-mobile-metro', dir: 'css', file: 'app-bar.css'], disposition: 'head'
        resource url:[plugin: 'jquery-mobile-metro', dir: 'css', file: 'toggle-button.css'], disposition: 'head'
        resource url:[plugin: 'jquery-mobile-metro', dir: 'css', file: 'mobiscroll-1.5.3.css'], disposition: 'head'

        resource url:[plugin: 'jquery-mobile-metro', dir: 'js', file: 'jquery.mobile.metro.theme.init.js'], disposition: 'head'
        resource url:[plugin: 'jquery-mobile-metro', dir: 'js', file: 'jquery.globalstylesheet.js'], disposition: 'head'
        resource url:[plugin: 'jquery-mobile-metro', dir: 'js', file: 'jquery.mobile.fixedToolbar.polyfill.js'], disposition: 'head'
        resource url:[plugin: 'jquery-mobile-metro', dir: 'js', file: 'progress-bar.js'], disposition: 'head'
        resource url:[plugin: 'jquery-mobile-metro', dir: 'js', file: 'toggle-button.js'], disposition: 'head'
        resource url:[plugin: 'jquery-mobile-metro', dir: 'js', file: 'app-bar.js'], disposition: 'head'
        resource url:[plugin: 'jquery-mobile-metro', dir: 'js', file: 'jquery.easing.1.3.js'], disposition: 'head'
        resource url:[plugin: 'jquery-mobile-metro', dir: 'js', file: 'mobiscroll-1.5.3.js'], disposition: 'head'
    }

}
