package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hzm0 implements izm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13914a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final List f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public hzm0(String str, String str2, boolean z, String str3, boolean z2, List list, String str4, String str5, String str6, String str7) {
        str4.getClass();
        str5.getClass();
        this.f13914a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = z2;
        this.f = list;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
    }

    @Override // a.d3h0
    public final String a() {
        return this.b;
    }

    @Override // a.d3h0
    public final String b() {
        return this.d;
    }

    @Override // a.izm0
    public final List d() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzm0)) {
            return false;
        }
        hzm0 hzm0Var = (hzm0) obj;
        return this.f13914a.equals(hzm0Var.f13914a) && this.b.equals(hzm0Var.b) && this.c == hzm0Var.c && this.d.equals(hzm0Var.d) && this.e == hzm0Var.e && this.f.equals(hzm0Var.f) && Intrinsics.d(this.g, hzm0Var.g) && Intrinsics.d(this.h, hzm0Var.h) && Intrinsics.d(this.i, hzm0Var.i) && Intrinsics.d(this.j, hzm0Var.j);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(dw9.a(brm0.e(ua80.b(brm0.e(ua80.b(this.f13914a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
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

    public final String toString() {
        StringBuilder sbN = b1j.n("Cricket(periodName=", this.f13914a, ", teamOneScore=", this.b, ", teamOneScoreChanged=");
        f140.s(", teamTwoScore=", this.d, ", teamTwoScoreChanged=", sbN, this.c);
        vqd.y(sbN, ", periodScores=", this.f, ", teamOneScoreWithWickets=", this.e);
        f140.v(sbN, this.g, ", teamTwoScoreWithWickets=", this.h, ", teamOneOvers=");
        return ua80.m(sbN, this.i, ", teamTwoOvers=", this.j, Separators.RPAREN);
    }
}
