package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ehs {
    public final boolean A;
    public final String B;
    public final ubr C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7822a;
    public final Integer b;
    public final int c;
    public final String d;
    public final List e;
    public final Integer f;
    public final Integer g;
    public final vas h;
    public final String i;
    public final String j;
    public final List k;
    public final boolean l;
    public final int m;
    public final long n;
    public final List o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public ehs(String str, Integer num, int i, String str2, List list, Integer num2, Integer num3, vas vasVar, String str3, String str4, List list2, boolean z, int i2, long j, List list3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, String str5, ubr ubrVar) {
        this.f7822a = str;
        this.b = num;
        this.c = i;
        this.d = str2;
        this.e = list;
        this.f = num2;
        this.g = num3;
        this.h = vasVar;
        this.i = str3;
        this.j = str4;
        this.k = list2;
        this.l = z;
        this.m = i2;
        this.n = j;
        this.o = list3;
        this.p = z2;
        this.q = z3;
        this.r = z4;
        this.s = z5;
        this.t = z6;
        this.u = z7;
        this.v = z8;
        this.w = z9;
        this.x = z10;
        this.y = z11;
        this.z = z12;
        this.A = z13;
        this.B = str5;
        this.C = ubrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehs)) {
            return false;
        }
        ehs ehsVar = (ehs) obj;
        return Intrinsics.d(this.f7822a, ehsVar.f7822a) && Intrinsics.d(this.b, ehsVar.b) && this.c == ehsVar.c && this.d.equals(ehsVar.d) && Intrinsics.d(this.e, ehsVar.e) && Intrinsics.d(this.f, ehsVar.f) && Intrinsics.d(this.g, ehsVar.g) && Intrinsics.d(this.h, ehsVar.h) && Intrinsics.d(this.i, ehsVar.i) && Intrinsics.d(this.j, ehsVar.j) && Intrinsics.d(this.k, ehsVar.k) && this.l == ehsVar.l && this.m == ehsVar.m && this.n == ehsVar.n && Intrinsics.d(this.o, ehsVar.o) && this.p == ehsVar.p && this.q == ehsVar.q && this.r == ehsVar.r && this.s == ehsVar.s && this.t == ehsVar.t && this.u == ehsVar.u && this.v == ehsVar.v && this.w == ehsVar.w && this.x == ehsVar.x && this.y == ehsVar.y && this.z == ehsVar.z && this.A == ehsVar.A && Intrinsics.d(this.B, ehsVar.B) && this.C.equals(ehsVar.C);
    }

    public final int hashCode() {
        String str = this.f7822a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iB = ua80.b(twn.a(this.c, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.d);
        List list = this.e;
        int iHashCode2 = (iB + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        vas vasVar = this.h;
        int iHashCode5 = (iHashCode4 + (vasVar == null ? 0 : vasVar.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list2 = this.k;
        int iB2 = rw2.b(twn.a(this.m, brm0.e((iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.l), 31), 31, this.n);
        List list3 = this.o;
        int iE = brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((iB2 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A);
        String str4 = this.B;
        return this.C.hashCode() + ((iE + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "GameItemScoreModel(periodStr=", this.f7822a, ", period=", ", serve=");
        kng0.w(this.c, ", fullScoreStr=", this.d, ", periodScoreList=", sbP);
        sbP.append(this.e);
        sbP.append(", scoreFirst=");
        sbP.append(this.f);
        sbP.append(", scoreSecond=");
        sbP.append(this.g);
        sbP.append(", subScore=");
        sbP.append(this.h);
        sbP.append(", periodFullScore=");
        f140.v(sbP, this.i, ", folls=", this.j, ", tabloStats=");
        rz4.z(sbP, ", isBreak=", this.k, ", bestOfMaps=", this.l);
        sbP.append(this.m);
        sbP.append(", timeSec=");
        sbP.append(this.n);
        esw0.k(sbP, ", dopInfo=", this.o, ", timeIsBackDirection=", this.p);
        w6x.A(", subSCoreFirsIncrease=", ", subScoreSecondIncrease=", sbP, this.q, this.r);
        w6x.A(", periodFirstIncrease=", ", periodSecondIncrease=", sbP, this.s, this.t);
        w6x.A(", increaseScoreFirst=", ", increaseScoreSecond=", sbP, this.u, this.v);
        w6x.A(", periodFirstDecrease=", ", periodSecondDecrease=", sbP, this.w, this.x);
        w6x.A(", decreaseScoreFirst=", ", decreaseScoreSecond=", sbP, this.y, this.z);
        hne.u(", timeRun=", ", statusLine=", this.B, sbP, this.A);
        sbP.append(", fullScoreDetailsModel=");
        sbP.append(this.C);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
