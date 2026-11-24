package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lz10 implements pz10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20888a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final String g;
    public final String h;
    public final int i;
    public final String j;
    public final String k;

    public lz10(String str, String str2, boolean z, String str3, boolean z2, ArrayList arrayList, String str4, String str5, int i, String str6, String str7) {
        str4.getClass();
        str5.getClass();
        this.f20888a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = z2;
        this.f = arrayList;
        this.g = str4;
        this.h = str5;
        this.i = i;
        this.j = str6;
        this.k = str7;
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
        if (!(obj instanceof lz10)) {
            return false;
        }
        lz10 lz10Var = (lz10) obj;
        return this.f20888a.equals(lz10Var.f20888a) && this.b.equals(lz10Var.b) && this.c == lz10Var.c && this.d.equals(lz10Var.d) && this.e == lz10Var.e && this.f.equals(lz10Var.f) && Intrinsics.d(this.g, lz10Var.g) && Intrinsics.d(this.h, lz10Var.h) && this.i == lz10Var.i && Intrinsics.d(this.j, lz10Var.j) && Intrinsics.d(this.k, lz10Var.k);
    }

    public final int hashCode() {
        int iA = twn.a(this.i, ua80.b(ua80.b(twn.g(this.f, brm0.e(ua80.b(brm0.e(ua80.b(this.f20888a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31);
        String str = this.j;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
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
        return this.f20888a;
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Cricket(periodName=", this.f20888a, ", teamOneScore=", this.b, ", teamOneScoreChanged=");
        f140.s(", teamTwoScore=", this.d, ", teamTwoScoreChanged=", sbN, this.c);
        sbN.append(this.e);
        sbN.append(", periodScores=");
        sbN.append(this.f);
        sbN.append(", teamOneScoreWithWickets=");
        f140.v(sbN, this.g, ", teamTwoScoreWithWickets=", this.h, ", serve=");
        kng0.w(this.i, ", teamOneOvers=", this.j, ", teamTwoOvers=", sbN);
        return axq.n(sbN, this.k, Separators.RPAREN);
    }
}
