package de.ywegel.zeiterfassung

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform