package a;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class uq8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ uq8 f36106a = new uq8();
    public static final String b = vq8.class.getSimpleName();

    public static vq8 a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return wq8.f39577a;
        }
        if (i >= 29) {
            return rv00.e;
        }
        return i >= 28 ? jtv.c : ujn.d;
    }
}
