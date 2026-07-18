package com.mif.mahmoudcv.util

import java.awt.Desktop
import java.net.URI

actual fun openUrl(url: String) {
    if (Desktop.isDesktopSupported()) {
        Desktop.getDesktop().browse(URI(url))
    }
}

actual fun openPhoneDialer(phoneNumber: String) {
    // Desktop doesn't have a phone dialer, open as URL
    val cleanNumber = phoneNumber.replace(" ", "").replace("-", "")
    openUrl("tel:$cleanNumber")
}

actual fun openEmailClient(email: String) {
    if (Desktop.isDesktopSupported()) {
        Desktop.getDesktop().mail(URI("mailto:$email"))
    }
}




