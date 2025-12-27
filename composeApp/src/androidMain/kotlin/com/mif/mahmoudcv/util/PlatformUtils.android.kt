package com.mif.mahmoudcv.util

import android.content.Intent
import android.net.Uri
import com.mif.mahmoudcv.ContextProvider

actual fun openUrl(url: String) {
    val context = ContextProvider.context
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    context.startActivity(intent)
}

actual fun openPhoneDialer(phoneNumber: String) {
    val context = ContextProvider.context
    val cleanNumber = phoneNumber.replace(" ", "").replace("-", "")
    val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$cleanNumber"))
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    context.startActivity(intent)
}

actual fun openEmailClient(email: String) {
    val context = ContextProvider.context
    val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:$email"))
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    context.startActivity(intent)
}


