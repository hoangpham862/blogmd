# Firebase Crashlytics Implementation Guide

## 1. Add Dependency

Implement `firebase-crashlytics` inside your **dependencies** to enable
error reporting and crash analysis.

``` gradle
dependencies {
    implementation 'com.google.firebase:firebase-crashlytics'
}
```

------------------------------------------------------------------------

## 2. Configure `settings.gradle`

Add the Crashlytics plugin in your **settings.gradle** file with
`apply false`. This ensures the plugin is **declared** globally but
**only applied** inside the `app` module.

``` gradle
pluginManagement {
    plugins {
        id "com.google.firebase.crashlytics" version "2.8.1" apply false
    }
}
```

------------------------------------------------------------------------

## 3. Apply Plugin Inside the App Module

In your `app/build.gradle` file, apply the Crashlytics plugin:

``` gradle
plugins {
    id "com.google.firebase.crashlytics"
}
```

This activates Firebase Crashlytics specifically for the app module.

------------------------------------------------------------------------

## 4. Setup and Configuration in the Project

### 🔹 `setCrashlyticsCollectionEnabled(bool enabled)`

Enables or disables the automatic crash reporting collection.

-   `true`: Crash reports are sent to Firebase.
-   `false`: Crash reports are disabled (useful for debug mode).

``` dart
await FirebaseCrashlytics.instance.setCrashlyticsCollectionEnabled(true);
```

------------------------------------------------------------------------

### 🔹 `recordError(Object error, StackTrace stack)`

Records an error manually to Firebase Crashlytics without crashing the
app.

``` dart
try {
  // some logic that may fail
} catch (error, stack) {
  await FirebaseCrashlytics.instance.recordError(error, stack);
}
```

------------------------------------------------------------------------

### 🔹 `setUserIdentifier(String identifier)`

Associates a crash report with a specific user for easier debugging and
tracking.

``` dart
await FirebaseCrashlytics.instance.setUserIdentifier(user.id);
```

> Useful when your app includes user authentication --- helps identify
> which user encountered a specific issue.

------------------------------------------------------------------------

### 🔹 `log(String message)`

Adds custom log messages to Crashlytics for better context before a
crash or error.

``` dart
FirebaseCrashlytics.instance.log('User tapped submit button');
```

> These logs are uploaded only when a crash or recorded error occurs.

------------------------------------------------------------------------

### 🔹 `crash()`

Forces the app to crash --- used only for testing Crashlytics setup.

``` dart
FirebaseCrashlytics.instance.crash();
```

> ⚠️ Use this **only** in a test or debug environment to verify that
> Crashlytics correctly captures and uploads crash reports.

------------------------------------------------------------------------

## ✅ Summary

  Function                            Purpose
  ----------------------------------- ---------------------------------
  `setCrashlyticsCollectionEnabled`   Enable/disable crash collection
  `recordError`                       Log a handled exception
  `setUserIdentifier`                 Tag crash with user ID
  `log`                               Add contextual debug messages
  `crash()`                           Test crash reporting

------------------------------------------------------------------------

### 🧩 Recommended Flow in Flutter

``` dart
void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  await Firebase.initializeApp();

  // Enable Crashlytics only for release builds
  await FirebaseCrashlytics.instance.setCrashlyticsCollectionEnabled(kReleaseMode);

  FlutterError.onError = FirebaseCrashlytics.instance.recordFlutterFatalError;

  runApp(MyApp());
}
```



CONFIG_FILE="$(realpath "${SRCROOT}/../.env")"
# Kiểm tra nếu tệp tồn tại
if [ ! -f "$CONFIG_FILE" ]; then
  echo "Error: .env file not found at $CONFIG_FILE"
  exit 1
fi

set -a
source "$CONFIG_FILE"
set +a
echo "ENVIRONMENT: $ENVIRONMENT"
echo "DART_DEFINES (Base64 Encoded): $DART_DEFINES"
 # Giải mã DART_DEFINES

IFS=',' read -r -a defines_array <<< "$DART_DEFINES"
for encoded in "${defines_array[@]}"; do
  define=$(echo "$encoded" | base64 --decode)
  if [[ $define == Env* ]]; then
    export DART_DEFINE_ENVIRONMENT="${define#Env=}"
  fi
  echo "===> DART_DEFINE_ENVIRONMENT: $DART_DEFINE_ENVIRONMENT"
done

if [ -z "$DART_DEFINE_ENVIRONMENT" ]; then
  echo "Error: DART_DEFINE_ENVIRONMENT is not defined or empty!"
else
      ENVIRONMENT="$DART_DEFINE_ENVIRONMENT"
fi
FIREBASE_APP_PATH_FILE="${PROJECT_DIR}/firebase/${ENVIRONMENT}/firebase_app_id_file.json" 
echo "FIREBASE_APP_PATH_FILE: ${FIREBASE_APP_PATH_FILE}"

"$PODS_ROOT/FirebaseCrashlytics/upload-symbols" --flutter-project "${FIREBASE_APP_PATH_FILE}" 
