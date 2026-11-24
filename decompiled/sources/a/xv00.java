package a;

import android.util.Log;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class xv00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tv00 f41534a = new tv00();

    public static void a() {
        f41534a.getClass();
    }

    public static void b(String str) {
        f41534a.getClass();
        HashSet hashSet = tv00.f34576a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void c(String str, Throwable th) {
        f41534a.getClass();
        HashSet hashSet = tv00.f34576a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        hashSet.add(str);
    }
}
