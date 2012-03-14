package psc.oracle.scorecard

import psc.oracle.scorecard.service.DateUtilService


class Person {

	String fullName
	String personType
	String email
	Date startDate
	Date endDate
	Boolean enableFlag
	
    static constraints = {
		fullName size: 4..12, unique: true, blank: false
		personType inList: ['PDM', 'PSC', 'PSC Manager']
		email email: true, blank:false
		startDate min: DateUtilService.getCurrentDate(), blank: false
		endDate nullable: true
		enableFlag blank: false
    }


	@Override
	public String toString() {
		return "Person [fullName=" + fullName + "]";
	}}
