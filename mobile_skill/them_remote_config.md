# 🔧 Firebase Remote Config Setup Guide

This guide explains how to configure **Firebase Remote Config** in your Flutter application after initializing Firebase.

---

## 🚀 Step 1: Initialize Remote Config

After successfully setting up Firebase, you can initialize and configure Remote Config as follows: 

```dart
import 'package:firebase_remote_config/firebase_remote_config.dart';

final remoteConfig = FirebaseRemoteConfig.instance;

await remoteConfig.setConfigSettings(RemoteConfigSettings(
  fetchTimeout: const Duration(seconds: 5),
  minimumFetchInterval: const Duration(minutes: 15),
));
```

### ⚙️ Explanation

| Setting | Description | Example Value |
|----------|--------------|----------------|
| `fetchTimeout` | Maximum time allowed for fetching new config values before it times out | `5 seconds` |
| `minimumFetchInterval` | Minimum interval before fetching remote data again | `15 minutes` |

These configurations help balance **data freshness** and **network efficiency**.

---

## 🔄 Step 2: Fetch and Activate Remote Config

To retrieve and apply the latest configuration values from Firebase, use:

```dart
await remoteConfig.fetchAndActivate();
```

### 🧠 What It Does
- **fetchAndActivate()** downloads the newest values from the Remote Config server.
- If the fetch is successful, it **activates** them immediately.
- This ensures your app always has the most recent configurations available.

---

## ✅ Example Usage

```dart
void setupRemoteConfig() async {
  final remoteConfig = FirebaseRemoteConfig.instance;

  await remoteConfig.setConfigSettings(RemoteConfigSettings(
    fetchTimeout: const Duration(seconds: 5),
    minimumFetchInterval: const Duration(minutes: 15),
  ));

  await remoteConfig.fetchAndActivate();

  final welcomeMessage = remoteConfig.getString('welcome_message');
  print('Fetched remote message: $welcomeMessage');
}
```

---

## 💡 Summary

- **`setConfigSettings`** → defines timeout and fetch interval behavior.  
- **`fetchAndActivate`** → fetches and applies latest server configs.  
- Recommended to **fetch on app startup** or **manually trigger** in specific screens.

With this setup, your Flutter app will dynamically respond to server-side configuration updates without needing a redeploy.

---

