package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xwl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41615a;
    public final long b;
    public final int c;

    public xwl0(String str, long j, int i) {
        this.f41615a = str;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwl0)) {
            return false;
        }
        xwl0 xwl0Var = (xwl0) obj;
        return this.f41615a.equals(xwl0Var.f41615a) && this.b == xwl0Var.b && this.c == xwl0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + rw2.b(this.f41615a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vqd.p(f140.o(this.b, "StadiumParams(stadiumId=", this.f41615a, ", sportId="), ", titleResId=", this.c, Separators.RPAREN);
    }
}
