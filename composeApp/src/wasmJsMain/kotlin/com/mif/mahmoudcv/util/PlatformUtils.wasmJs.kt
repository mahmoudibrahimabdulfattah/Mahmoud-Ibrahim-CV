package com.mif.mahmoudcv.util

import kotlinx.browser.window

actual fun currentPlatform(): AppPlatform = AppPlatform.WEB

actual fun openUrl(url: String) {
    window.open(url, "_blank")
}

actual fun openPhoneDialer(phoneNumber: String) {
    val cleanNumber = phoneNumber.replace(" ", "").replace("-", "")
    window.open("tel:$cleanNumber", "_self")
}

actual fun openEmailClient(email: String) {
    window.open("mailto:$email", "_self")
}



