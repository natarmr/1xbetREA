package a;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class w99 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w99 f38768a = new w99();
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;

    static {
        int i = Build.VERSION.SDK_INT;
        b = i >= 30 ? v99.f37023a.a(30) : 0;
        c = i >= 30 ? v99.f37023a.a(31) : 0;
        d = i >= 30 ? v99.f37023a.a(33) : 0;
        e = i >= 30 ? v99.f37023a.a(1000000) : 0;
    }

    private w99() {
    }
}
