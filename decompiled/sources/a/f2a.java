package a;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class f2a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f8802a;
    public final long b;
    public final Throwable c;

    public f2a(Exception exc, long j) {
        this.b = SystemClock.elapsedRealtime() - j;
        if (exc instanceof w3a) {
            this.f8802a = (byte) 2;
            this.c = exc;
            return;
        }
        if (!(exc instanceof nbx)) {
            this.f8802a = (byte) 0;
            this.c = exc;
            return;
        }
        Throwable cause = exc.getCause();
        exc = cause != null ? cause : exc;
        this.c = exc;
        if (exc instanceof k3a) {
            this.f8802a = (byte) 2;
        } else if (exc instanceof IllegalArgumentException) {
            this.f8802a = (byte) 1;
        } else {
            this.f8802a = (byte) 0;
        }
    }
}
