package org.sopt.notification.notification

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class SampleMessagingService : FirebaseMessagingService() {
    override fun onNewToken(token: String) {
        
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage) {

    }
}