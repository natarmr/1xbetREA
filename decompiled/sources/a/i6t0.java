package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class i6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14260a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final long g;
    public final k6t0 h;
    public final j6t0 i;
    public final boolean j;

    public i6t0(long j, long j2, String str, String str2, long j3, String str3, long j4, k6t0 k6t0Var, j6t0 j6t0Var, boolean z) {
        this.f14260a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = j3;
        this.f = str3;
        this.g = j4;
        this.h = k6t0Var;
        this.i = j6t0Var;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6t0)) {
            return false;
        }
        i6t0 i6t0Var = (i6t0) obj;
        return this.f14260a == i6t0Var.f14260a && this.b == i6t0Var.b && this.c.equals(i6t0Var.c) && this.d.equals(i6t0Var.d) && znq0.e(this.e, i6t0Var.e) && this.f.equals(i6t0Var.f) && this.g == i6t0Var.g && this.h == i6t0Var.h && this.i == i6t0Var.i && this.j == i6t0Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + rw2.b(ua80.b(rw2.b(ua80.b(ua80.b(rw2.b(Long.hashCode(this.f14260a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31);
    }

    public final String toString() {
        String strH = znq0.h(this.e);
        StringBuilder sbQ = kng0.q(this.f14260a, "UfcShortGameModel(firstFighterId=", ", secondFighterId=");
        kng0.z(sbQ, this.b, ", firstFighterName=", this.c);
        f140.v(sbQ, ", secondFighterName=", this.d, ", startTime=", strH);
        hne.B(sbQ, ", tournamentTitle=", this.f, ", champId=");
        sbQ.append(this.g);
        sbQ.append(", winner=");
        sbQ.append(this.h);
        sbQ.append(", status=");
        sbQ.append(this.i);
        sbQ.append(", isHeadline=");
        sbQ.append(this.j);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
