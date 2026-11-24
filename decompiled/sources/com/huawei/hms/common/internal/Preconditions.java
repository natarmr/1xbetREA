package com.huawei.hms.common.internal;

import a.hny;
import a.jf4;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError("Cannot use constructor to make a new instance");
    }

    private static boolean a() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static void checkArgument(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void checkHandlerThread(Handler handler, String str) {
        if (Looper.myLooper() == handler.getLooper()) {
            return;
        }
        jf4.n(str);
    }

    public static void checkMainThread(String str) {
        if (a()) {
            return;
        }
        jf4.n(str);
    }

    public static void checkNotMainThread() {
        if (a()) {
            jf4.n("Must not be called on the main application thread");
        }
    }

    public static <O> O checkNotNull(O o, Object obj) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static <O> O checkNotNull(O o) {
        if (o != null) {
            return o;
        }
        hny.u("must not refer to a null object");
        return null;
    }

    public static void checkHandlerThread(Handler handler) {
        checkHandlerThread(handler, "Must be called on the handler thread");
    }
}
