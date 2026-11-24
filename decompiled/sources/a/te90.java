package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class te90 implements d3h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33809a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;

    public te90(String str, String str2, String str3, boolean z, boolean z2) {
        this.f33809a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = z2;
    }

    @Override // a.d3h0
    public final String a() {
        return this.b;
    }

    @Override // a.d3h0
    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te90)) {
            return false;
        }
        te90 te90Var = (te90) obj;
        return this.f33809a.equals(te90Var.f33809a) && this.b.equals(te90Var.b) && this.c == te90Var.c && this.d.equals(te90Var.d) && this.e == te90Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(brm0.e(ua80.b(this.f33809a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // a.d3h0
    public final boolean i() {
        return this.e;
    }

    @Override // a.d3h0
    public final boolean j() {
        return this.c;
    }

    @Override // a.d3h0
    public final String n() {
        throw null;
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PeriodScoreComparedModel(periodName=", this.f33809a, ", teamOneScore=", this.b, ", teamOneScoreChanged=");
        f140.s(", teamTwoScore=", this.d, ", teamTwoScoreChanged=", sbN, this.c);
        return rw2.p(sbN, this.e, Separators.RPAREN);
    }
}
