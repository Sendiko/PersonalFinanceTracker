package id.my.sendiko.personalfinancetracker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform