@SuppressLint("SimpleDateFormat")
fun String.getDateAsText() : String {
    return java.text.SimpleDateFormat("MMMM dd,yyyy")
        .format(java.text.SimpleDateFormat("MM/dd/yy").parse(this.replace("\\", ""))).toUpperCase().replace(",",", ")
}
