package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wm7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39390a;
    public final long b;

    public wm7(String str, long j) {
        str.getClass();
        this.f39390a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm7)) {
            return false;
        }
        wm7 wm7Var = (wm7) obj;
        if (!Intrinsics.d(this.f39390a, wm7Var.f39390a)) {
            return false;
        }
        long j = wm7Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f39390a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return b1j.k("BetStatusUiModel(text=", this.f39390a, ", color=", y3d.i(this.b), Separators.RPAREN);
    }
}
