package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rqs {
    public final int A;
    public final ubr B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30947a;
    public final int b;
    public final String c;
    public final List d;
    public final int e;
    public final int f;
    public final int g;
    public final kts h;
    public final String i;
    public final long j;
    public final int k;
    public final int l;
    public final String m;
    public final List n;
    public final List o;
    public final boolean p;
    public final int q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public rqs(String str, int i, String str2, List list, int i2, int i3, int i4, kts ktsVar, String str3, long j, int i5, int i6, String str4, List list2, List list3, boolean z, int i7, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i8, ubr ubrVar) {
        b1j.B(list, list2, list3);
        this.f30947a = str;
        this.b = i;
        this.c = str2;
        this.d = list;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = ktsVar;
        this.i = str3;
        this.j = j;
        this.k = i5;
        this.l = i6;
        this.m = str4;
        this.n = list2;
        this.o = list3;
        this.p = z;
        this.q = i7;
        this.r = z2;
        this.s = z3;
        this.t = z4;
        this.u = z5;
        this.v = z6;
        this.w = z7;
        this.x = z8;
        this.y = z9;
        this.z = z10;
        this.A = i8;
        this.B = ubrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqs)) {
            return false;
        }
        rqs rqsVar = (rqs) obj;
        return this.f30947a.equals(rqsVar.f30947a) && this.b == rqsVar.b && this.c.equals(rqsVar.c) && Intrinsics.d(this.d, rqsVar.d) && this.e == rqsVar.e && this.f == rqsVar.f && this.g == rqsVar.g && this.h.equals(rqsVar.h) && this.i.equals(rqsVar.i) && this.j == rqsVar.j && this.k == rqsVar.k && this.l == rqsVar.l && this.m.equals(rqsVar.m) && Intrinsics.d(this.n, rqsVar.n) && Intrinsics.d(this.o, rqsVar.o) && this.p == rqsVar.p && this.q == rqsVar.q && this.r == rqsVar.r && this.s == rqsVar.s && this.t == rqsVar.t && this.u == rqsVar.u && this.v == rqsVar.v && this.w == rqsVar.w && this.x == rqsVar.x && this.y == rqsVar.y && this.z == rqsVar.z && this.A == rqsVar.A && this.B.equals(rqsVar.B);
    }

    public final int hashCode() {
        return this.B.hashCode() + twn.a(this.A, brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(twn.a(this.q, brm0.e(dw9.a(dw9.a(ua80.b(twn.a(this.l, twn.a(this.k, rw2.b(ua80.b((this.h.hashCode() + twn.a(this.g, twn.a(this.f, twn.a(this.e, dw9.a(ua80.b(twn.a(this.b, this.f30947a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31), 31), 31)) * 31, 31, this.i), 31, this.j), 31), 31), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, false), 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "GameScoreZip(periodText=", this.f30947a, ", period=", ", fullScore=");
        cs0.y(this.c, ", periodScoreList=", ", scoreFirst=", sbP, this.d);
        axq.r(this.e, this.f, ", scoreSecond=", ", serve=", sbP);
        sbP.append(this.g);
        sbP.append(", subScore=");
        sbP.append(this.h);
        sbP.append(", periodFullScore=");
        defpackage.c.i(sbP, this.j, this.i, ", timeSec=");
        rw2.s(this.k, this.l, ", timeDirection=", ", timeRun=", sbP);
        ua80.t(", folls=", this.m, ", dopInfo=", sbP, this.n);
        esw0.k(sbP, ", tabloStats=", this.o, ", isBreak=", this.p);
        dw9.v(this.q, ", bestOfMaps=", ", periodFirstIncrease=", sbP, this.r);
        w6x.A(", periodSecondIncrease=", ", increaseScoreFirst=", sbP, this.s, this.t);
        w6x.A(", increaseScoreSecond=", ", periodFirstDecrease=", sbP, this.u, this.v);
        w6x.A(", periodSecondDecrease=", ", decreaseScoreFirst=", sbP, this.w, this.x);
        w6x.A(", decreaseScoreSecond=", ", isBackDirection=", sbP, this.y, this.z);
        sbP.append(", isRun=false, gameStatus=");
        sbP.append(this.A);
        sbP.append(", fullScoreDetailsModel=");
        sbP.append(this.B);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
