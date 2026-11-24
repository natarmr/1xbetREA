package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class koh0 implements ooh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18630a;
    public final long b;
    public final String c;

    public koh0(String str, long j, boolean z) {
        str.getClass();
        this.f18630a = z;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof koh0)) {
            return false;
        }
        koh0 koh0Var = (koh0) obj;
        if (this.f18630a != koh0Var.f18630a) {
            return false;
        }
        long j = koh0Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && Intrinsics.d(this.c, koh0Var.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f18630a) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.c.hashCode() + rw2.b(iHashCode, 31, this.b);
    }

    public final String toString() {
        return axq.n(axq.q("Gift(isPromoAvailable=", ", iconTint=", y3d.i(this.b), this.f18630a, ", buttonText="), this.c, Separators.RPAREN);
    }
}
