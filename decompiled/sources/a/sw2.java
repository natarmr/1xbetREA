package a;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class sw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final evc f32900a;
    public final long b;
    public final az9 c;
    public final Throwable d;

    public sw2(evc evcVar, az9 az9Var, Exception exc, int i) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        az9Var = (i & 4) != 0 ? null : az9Var;
        exc = (i & 8) != 0 ? null : exc;
        this.f32900a = evcVar;
        this.b = jElapsedRealtimeNanos;
        this.c = az9Var;
        this.d = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw2)) {
            return false;
        }
        sw2 sw2Var = (sw2) obj;
        return this.f32900a == sw2Var.f32900a && this.b == sw2Var.b && Intrinsics.d(this.c, sw2Var.c) && Intrinsics.d(this.d, sw2Var.d);
    }

    public final int hashCode() {
        int iB = rw2.b(this.f32900a.hashCode() * 31, 31, this.b);
        az9 az9Var = this.c;
        int iHashCode = (iB + (az9Var == null ? 0 : Integer.hashCode(az9Var.f1706a))) * 31;
        Throwable th = this.d;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ClosingInfo(reason=" + this.f32900a + ", closingTimestamp=" + ((Object) doq0.a(this.b)) + ", errorCode=" + this.c + ", exception=" + this.d + ')';
    }
}
