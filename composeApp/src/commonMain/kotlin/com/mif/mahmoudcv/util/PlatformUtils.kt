package com.mif.mahmoudcv.util

/**
 * Platform-specific utility functions for opening URLs, phone dialer, email, etc.
 */
expect fun openUrl(url: String)

expect fun openPhoneDialer(phoneNumber: String)

expect fun openEmailClient(email: String)



