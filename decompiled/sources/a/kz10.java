package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class kz10 implements nz10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19132a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final int g;

    public kz10(String str, String str2, boolean z, String str3, boolean z2, ArrayList arrayList, int i) {
        this.f19132a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = z2;
        this.f = arrayList;
        this.g = i;
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
        if (!(obj instanceof kz10)) {
            return false;
        }
        kz10 kz10Var = (kz10) obj;
        return this.f19132a.equals(kz10Var.f19132a) && this.b.equals(kz10Var.b) && this.c == kz10Var.c && this.d.equals(kz10Var.d) && this.e == kz10Var.e && this.f.equals(kz10Var.f) && this.g == kz10Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + twn.g(this.f, brm0.e(ua80.b(brm0.e(ua80.b(this.f19132a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
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
        return this.f19132a;
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Common(periodName=", this.f19132a, ", teamOneScore=", this.b, ", teamOneScoreChanged=");
        f140.s(", teamTwoScore=", this.d, ", teamTwoScoreChanged=", sbN, this.c);
        sbN.append(this.e);
        sbN.append(", periodScores=");
        sbN.append(this.f);
        sbN.append(", serve=");
        return rz4.j(this.g, Separators.RPAREN, sbN);
    }
}
