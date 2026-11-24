package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i5d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14187a;
    public final String b;

    public i5d(long j, String str) {
        str.getClass();
        this.f14187a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5d)) {
            return false;
        }
        i5d i5dVar = (i5d) obj;
        long j = i5dVar.f14187a;
        int i = y3d.h;
        return h2t0.a(this.f14187a, j) && Intrinsics.d(this.b, i5dVar.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.b.hashCode() + (Long.hashCode(this.f14187a) * 31);
    }

    public final String toString() {
        return b1j.k("ColorUiModel(value=", y3d.i(this.f14187a), ", name=", this.b, Separators.RPAREN);
    }
}
