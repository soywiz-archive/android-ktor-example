Start/connect an android emulator or device

```
./gradlew installRelease
```

After starting the application:
```
adb shell am startservice com.soywiz.myapplication/.KtorFetchService
```

Then open chrome inside the emulator, and open:

http://127.0.0.1:7070/

