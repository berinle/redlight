package com.jrock.redlight

class HomeService {

    static transactional = false
    static expose = ['cxf']

    def soapCall() {
		log.debug "soapCall() called."
    }
}
