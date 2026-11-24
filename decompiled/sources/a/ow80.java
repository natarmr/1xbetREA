package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ow80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25958a;
    public final long b;
    public final long c;
    public final String d;
    public final long e;
    public final int f;
    public final boolean g;

    public ow80(int i, long j, long j2, long j3, long j4, String str, boolean z) {
        this.f25958a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = j4;
        this.f = i;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow80)) {
            return false;
        }
        ow80 ow80Var = (ow80) obj;
        return this.f25958a == ow80Var.f25958a && this.b == ow80Var.b && this.c == ow80Var.c && this.d.equals(ow80Var.d) && this.e == ow80Var.e && this.f == ow80Var.f && this.g == ow80Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + twn.a(this.f, rw2.b(ua80.b(rw2.b(rw2.b(Long.hashCode(this.f25958a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f25958a, "PartnerBottomInfoAnnounceClickParams(gameId=", ", sportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", subSportId=", this.c, ", champName=");
        defpackage.c.i(sbQ, this.e, this.d, ", champId=");
        dw9.v(this.f, ", globalChampId=", ", live=", sbQ, this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
