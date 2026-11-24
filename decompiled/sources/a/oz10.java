package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class oz10 implements nz10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26084a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final String g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final String k;
    public final boolean l;
    public final String m;
    public final boolean n;
    public final int o;

    public oz10(String str, String str2, boolean z, String str3, boolean z2, ArrayList arrayList, String str4, boolean z3, String str5, boolean z4, String str6, boolean z5, String str7, boolean z6, int i) {
        this.f26084a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = z2;
        this.f = arrayList;
        this.g = str4;
        this.h = z3;
        this.i = str5;
        this.j = z4;
        this.k = str6;
        this.l = z5;
        this.m = str7;
        this.n = z6;
        this.o = i;
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
        if (!(obj instanceof oz10)) {
            return false;
        }
        oz10 oz10Var = (oz10) obj;
        return this.f26084a.equals(oz10Var.f26084a) && this.b.equals(oz10Var.b) && this.c == oz10Var.c && this.d.equals(oz10Var.d) && this.e == oz10Var.e && this.f.equals(oz10Var.f) && this.g.equals(oz10Var.g) && this.h == oz10Var.h && this.i.equals(oz10Var.i) && this.j == oz10Var.j && this.k.equals(oz10Var.k) && this.l == oz10Var.l && this.m.equals(oz10Var.m) && this.n == oz10Var.n && this.o == oz10Var.o;
    }

    public final int hashCode() {
        return Integer.hashCode(this.o) + brm0.e(ua80.b(brm0.e(ua80.b(brm0.e(ua80.b(brm0.e(ua80.b(twn.g(this.f, brm0.e(ua80.b(brm0.e(ua80.b(this.f26084a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
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
        return this.f26084a;
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Tennis(periodName=", this.f26084a, ", teamOneScore=", this.b, ", teamOneScoreChanged=");
        f140.s(", teamTwoScore=", this.d, ", teamTwoScoreChanged=", sbN, this.c);
        sbN.append(this.e);
        sbN.append(", periodScores=");
        sbN.append(this.f);
        sbN.append(", teamOneSubScore=");
        brm0.C(this.g, ", teamOneSubScoreChanged=", ", teamTwoSubScore=", sbN, this.h);
        brm0.C(this.i, ", teamTwoSubScoreChanged=", ", teamOnePointsScore=", sbN, this.j);
        brm0.C(this.k, ", teamOnePointsScoreChanged=", ", teamTwoPointsScore=", sbN, this.l);
        brm0.C(this.m, ", teamTwoPointsScoreChanged=", ", serve=", sbN, this.n);
        return rz4.j(this.o, Separators.RPAREN, sbN);
    }
}
