package psc.oracle.scorecard

import psc.oracle.scorecard.service.DateUtilService
class Partner {

	String partnerFullName
	String partnerShortName
	String partnerType
	Date startDate
	Date endDate
	Boolean enableFlag

	@Override
	public String toString() {
		return "Partner [partnerShortName=" + partnerShortName + "]";
	}

	static constraints = {
		partnerShortName blank: false
		partnerFullName blank: true
		startDate min: DateUtilService.getCurrentDate(), blank: false
		endDate nullable: true
		enableFlag blank: true
	}
}
