package a;

import android.os.Looper;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ocq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f25040a;

    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        f25040a = id;
    }
}
