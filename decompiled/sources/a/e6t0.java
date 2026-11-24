package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class e6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7305a;
    public final String b;
    public final String c;
    public final long d;

    public e6t0(int i, long j, String str, String str2) {
        this.f7305a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6t0)) {
            return false;
        }
        e6t0 e6t0Var = (e6t0) obj;
        return this.f7305a == e6t0Var.f7305a && this.b.equals(e6t0Var.b) && this.c.equals(e6t0Var.c) && znq0.e(this.d, e6t0Var.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ua80.b(ua80.b(Integer.hashCode(this.f7305a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(vqd.r(this.f7305a, "UfcRoundModel(round=", ", winnerName=", this.b, ", typeOfWin="), this.c, ", time=", znq0.h(this.d), Separators.RPAREN);
    }
}
