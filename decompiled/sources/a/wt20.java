package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wt20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39719a;
    public final String b;
    public final int c;
    public final boolean d;

    public wt20(int i, long j, String str, boolean z) {
        this.f39719a = j;
        this.b = str;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt20)) {
            return false;
        }
        wt20 wt20Var = (wt20) obj;
        return this.f39719a == wt20Var.f39719a && this.b.equals(wt20Var.b) && this.c == wt20Var.c && this.d == wt20Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + twn.a(this.c, ua80.b(Long.hashCode(this.f39719a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f39719a, "MarketFilterModel(id=", ", name=", this.b);
        dw9.v(this.c, ", pinnedPosition=", ", hidden=", sbO, this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
