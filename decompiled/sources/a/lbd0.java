package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lbd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19751a;
    public final boolean b;
    public final String c;
    public final String d;
    public final oo5 e;
    public final int f;

    public lbd0(boolean z, boolean z2, String str, String str2, oo5 oo5Var, int i) {
        this.f19751a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = oo5Var;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbd0)) {
            return false;
        }
        lbd0 lbd0Var = (lbd0) obj;
        return this.f19751a == lbd0Var.f19751a && this.b == lbd0Var.b && this.c.equals(lbd0Var.c) && this.d.equals(lbd0Var.d) && this.e == lbd0Var.e && this.f == lbd0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ((this.e.hashCode() + ua80.b(ua80.b(brm0.e(Boolean.hashCode(this.f19751a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("NewsPager(showNavBar=", ", needAuth=", ", translateId=", this.f19751a, this.b);
        f140.v(sbQ, this.c, ", title=", this.d, ", actionType=");
        sbQ.append(this.e);
        sbQ.append(", prizeFlag=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
