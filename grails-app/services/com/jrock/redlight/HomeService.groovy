package com.jrock.redlight

class HomeService {

    static transactional = false
    static expose = ['cxf']

    def soapCall() {
    	println "soapCall() called."
		log.debug "soapCall() called."
		2+2
    }
}
