package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t9d0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33556a;
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;

    public t9d0(int i, String str, String str2, String str3, boolean z) {
        this.f33556a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9d0)) {
            return false;
        }
        t9d0 t9d0Var = (t9d0) obj;
        return this.f33556a.equals(t9d0Var.f33556a) && this.b.equals(t9d0Var.b) && this.c == t9d0Var.c && this.d.equals(t9d0Var.d) && this.e == t9d0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(twn.a(this.c, ua80.b(this.f33556a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BetWithoutRisk(title=", this.f33556a, ", translateId=", this.b, ", lotteryId=");
        kng0.w(this.c, ", imageUrl=", this.d, ", needAuth=", sbN);
        return rw2.p(sbN, this.e, Separators.RPAREN);
    }
}
