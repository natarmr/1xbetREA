package a;

import android.app.ActivityManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class eq80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f8225a;

    static {
        ClassLoader classLoader;
        char[] cArr = fq80.d;
        boolean z = true;
        if (!j47.x0("robolectric", Build.FINGERPRINT) && (((classLoader = fq80.class.getClassLoader()) == null || (classLoader.getResource("androidx/test/espresso/Espresso.class") == null && classLoader.getResource("org/junit/runner/Runner.class") == null && classLoader.getResource("androidx/test/platform/app/InstrumentationRegistry.class") == null)) && !ActivityManager.isRunningInTestHarness())) {
            z = false;
        }
        f8225a = z;
    }
}
