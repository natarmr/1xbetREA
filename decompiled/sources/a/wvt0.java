package a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class wvt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f39856a = new AtomicInteger();
    public static final n0o0 b = maz.b(vut0.g);
    public static final n0o0 c = maz.b(vut0.h);

    public static void a(Runnable runnable) {
        if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            ((Handler) b.getValue()).postDelayed(runnable, 0L);
        }
    }
}
