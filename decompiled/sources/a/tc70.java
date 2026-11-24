package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tc70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33706a;
    public final long b;

    public tc70(String str, long j) {
        str.getClass();
        this.f33706a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc70)) {
            return false;
        }
        tc70 tc70Var = (tc70) obj;
        if (!Intrinsics.d(this.f33706a, tc70Var.f33706a)) {
            return false;
        }
        long j = tc70Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f33706a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return b1j.k("Top(title=", this.f33706a, ", titleColor=", y3d.i(this.b), Separators.RPAREN);
    }
}
