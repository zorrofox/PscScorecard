package psc.oracle.scorecard.service

class DateUtilService {

	static public getCurrentDate() {
		Calendar calendar=Calendar.getInstance()
		Calendar currentCal = Calendar.getInstance()
		currentCal.clear()
		currentCal.set(calendar.get(Calendar.YEAR),
				calendar.get(Calendar.MONTH),
				calendar.get(Calendar.DAY_OF_MONTH),
				0,
				0,
				0)
		currentCal.getTime()
	}
}
