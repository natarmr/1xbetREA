package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class mz10 implements nz10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22631a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final int g;
    public final String h;
    public final boolean i;
    public final String j;
    public final boolean k;

    public mz10(String str, String str2, boolean z, String str3, boolean z2, ArrayList arrayList, int i, String str4, boolean z3, String str5, boolean z4) {
        this.f22631a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = z2;
        this.f = arrayList;
        this.g = i;
        this.h = str4;
        this.i = z3;
        this.j = str5;
        this.k = z4;
    }

    @Override // a.d3h0
    public final String a() {
        return this.b;
    }

    @Override // a.d3h0
    public final String b() {
        return this.d;
    }

    @Override // a.pz10
    public final List d() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz10)) {
            return false;
        }
        mz10 mz10Var = (mz10) obj;
        return this.f22631a.equals(mz10Var.f22631a) && this.b.equals(mz10Var.b) && this.c == mz10Var.c && this.d.equals(mz10Var.d) && this.e == mz10Var.e && this.f.equals(mz10Var.f) && this.g == mz10Var.g && this.h.equals(mz10Var.h) && this.i == mz10Var.i && this.j.equals(mz10Var.j) && this.k == mz10Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + ua80.b(brm0.e(ua80.b(twn.a(this.g, twn.g(this.f, brm0.e(ua80.b(brm0.e(ua80.b(this.f22631a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31, this.i), 31, this.j);
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
        return this.f22631a;
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Darts(periodName=", this.f22631a, ", teamOneScore=", this.b, ", teamOneScoreChanged=");
        f140.s(", teamTwoScore=", this.d, ", teamTwoScoreChanged=", sbN, this.c);
        sbN.append(this.e);
        sbN.append(", periodScores=");
        sbN.append(this.f);
        sbN.append(", serve=");
        kng0.w(this.g, ", teamOnePointsScore=", this.h, ", teamOnePointsScoreChanged=", sbN);
        f140.s(", teamTwoPointsScore=", this.j, ", teamTwoPointsScoreChanged=", sbN, this.i);
        return rw2.p(sbN, this.k, Separators.RPAREN);
    }
}
