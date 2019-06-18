    fun getDateLabel(date:String,frequency: String) : String = if (!date.equals(getApplication<Application>().resources.getString(R.string.next_due_date))) {
        when (frequency) {
            EnvelopeFrequency.Weekly.toString() -> DateUtility.toWeekDay(date)
            EnvelopeFrequency.Monthly.toString() -> DateUtility.toTheMonthDay(date)
            EnvelopeFrequency.Monthly3.toString() -> DateUtility.toYearlyMonthDay(date)
            EnvelopeFrequency.Monthly6.toString() -> DateUtility.toYearlyMonthDay(date)
            EnvelopeFrequency.Yearly.toString() -> DateUtility.toYearlyMonthDay(date)
            else -> ""
        }
    } else {
        ""
    }
