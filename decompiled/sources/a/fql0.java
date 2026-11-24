package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class fql0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9981a;
    public final long b;
    public final long c;
    public final b8l0 d;
    public final d4d e;
    public final n3l0 f;
    public final sfl0 g;
    public final boolean h;
    public final hhv i;

    public fql0(long j, long j2, long j3, b8l0 b8l0Var, d4d d4dVar, n3l0 n3l0Var, sfl0 sfl0Var, boolean z, hhv hhvVar) {
        hhvVar.getClass();
        this.f9981a = j;
        this.b = j2;
        this.c = j3;
        this.d = b8l0Var;
        this.e = d4dVar;
        this.f = n3l0Var;
        this.g = sfl0Var;
        this.h = z;
        this.i = hhvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fql0)) {
            return false;
        }
        fql0 fql0Var = (fql0) obj;
        return this.f9981a == fql0Var.f9981a && this.b == fql0Var.b && this.c == fql0Var.c && this.d.equals(fql0Var.d) && this.e == fql0Var.e && this.f.equals(fql0Var.f) && this.g == fql0Var.g && this.h == fql0Var.h && this.i == fql0Var.i;
    }

    @Override // a.p6t0
    public final String getKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9981a);
        sb.append(this.g);
        return sb.toString();
    }

    public final int hashCode() {
        return this.i.hashCode() + brm0.e((this.g.hashCode() + ((this.f.hashCode() + dw9.b(this.e, (this.d.hashCode() + rw2.b(rw2.b(Long.hashCode(this.f9981a) * 31, 31, this.b), 31, this.c)) * 31, 31)) * 31)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f9981a, "SportUiItem(id=", ", sportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", subSportId=", this.c, ", model=");
        sbQ.append(this.d);
        sbQ.append(", backgroundColor=");
        sbQ.append(this.e);
        sbQ.append(", shape=");
        sbQ.append(this.f);
        sbQ.append(", type=");
        sbQ.append(this.g);
        sbQ.append(", showSeparator=");
        sbQ.append(this.h);
        sbQ.append(", positionType=");
        sbQ.append(this.i);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
