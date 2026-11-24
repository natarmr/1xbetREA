package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class val0 implements abl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37095a;
    public final long b;
    public final boolean c;
    public final String d;
    public final long e;

    public val0(long j, long j2, long j3, String str, boolean z) {
        str.getClass();
        this.f37095a = j;
        this.b = j2;
        this.c = z;
        this.d = str;
        this.e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof val0)) {
            return false;
        }
        val0 val0Var = (val0) obj;
        return this.f37095a == val0Var.f37095a && this.b == val0Var.b && this.c == val0Var.c && Intrinsics.d(this.d, val0Var.d) && this.e == val0Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ua80.b(brm0.e(rw2.b(Long.hashCode(this.f37095a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f37095a, "ShowBetting(gameId=", ", subGameId=");
        hne.t(this.b, ", live=", sbQ, this.c);
        hne.B(sbQ, ", componentKey=", this.d, ", sportId=");
        return brm0.k(this.e, Separators.RPAREN, sbQ);
    }
}
