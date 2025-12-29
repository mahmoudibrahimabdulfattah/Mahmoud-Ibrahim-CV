package com.mif.mahmoudcv.util

import platform.Foundation.NSURL
import platform.UIKit.UIApplication

actual fun openUrl(url: String) {
    val nsUrl = NSURL.URLWithString(url) ?: return
    UIApplication.sharedApplication.openURL(nsUrl)
}

actual fun openPhoneDialer(phoneNumber: String) {
    val cleanNumber = phoneNumber.replace(" ", "").replace("-", "")
    val telUrl = "tel:$cleanNumber"
    val nsUrl = NSURL.URLWithString(telUrl) ?: return
    UIApplication.sharedApplication.openURL(nsUrl)
}

actual fun openEmailClient(email: String) {
    val mailtoUrl = "mailto:$email"
    val nsUrl = NSURL.URLWithString(mailtoUrl) ?: return
    UIApplication.sharedApplication.openURL(nsUrl)
}



