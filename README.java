@SuppressLint("SimpleDateFormat")
fun String.getDateAsText() : String {
    return java.text.SimpleDateFormat("MMMM dd,yyyy")
        .format(java.text.SimpleDateFormat("MM/dd/yy").parse(replace("\\", ""))).toUpperCase().replace(",",", ")
}

@SuppressLint("SimpleDateFormat")
fun String.getFormattedAccountOpenDate() : String {
    return java.text.SimpleDateFormat("MMMM dd,yy")
        .format(java.text.SimpleDateFormat("MM/dd/yyyy").parse(replace("\\", "")))
}
