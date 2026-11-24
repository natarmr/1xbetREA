package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mxp {
    public final float A;
    public final String B;
    public final float C;
    public final int D;
    public final int E;
    public final float F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final rxp K;
    public final vxp L;
    public final fyp M;
    public final int N;
    public final float O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22568a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final f7v0 g;
    public final float h;
    public final float i;
    public final float j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final float u;
    public final float v;
    public final float w;
    public final float x;
    public final float y;
    public final float z;

    public mxp(long j, int i, String str, String str2, String str3, int i2, f7v0 f7v0Var, float f, float f2, float f3, String str4, String str5, String str6, String str7, String str8, int i3, int i4, int i5, int i6, int i7, float f4, float f5, float f6, float f7, float f8, float f9, float f10, String str9, float f11, int i8, int i9, float f12, int i10, int i11, int i12, int i13, rxp rxpVar, vxp vxpVar, fyp fypVar, int i14, float f13) {
        this.f22568a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i2;
        this.g = f7v0Var;
        this.h = f;
        this.i = f2;
        this.j = f3;
        this.k = str4;
        this.l = str5;
        this.m = str6;
        this.n = str7;
        this.o = str8;
        this.p = i3;
        this.q = i4;
        this.r = i5;
        this.s = i6;
        this.t = i7;
        this.u = f4;
        this.v = f5;
        this.w = f6;
        this.x = f7;
        this.y = f8;
        this.z = f9;
        this.A = f10;
        this.B = str9;
        this.C = f11;
        this.D = i8;
        this.E = i9;
        this.F = f12;
        this.G = i10;
        this.H = i11;
        this.I = i12;
        this.J = i13;
        this.K = rxpVar;
        this.L = vxpVar;
        this.M = fypVar;
        this.N = i14;
        this.O = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxp)) {
            return false;
        }
        mxp mxpVar = (mxp) obj;
        return this.f22568a == mxpVar.f22568a && this.b == mxpVar.b && this.c.equals(mxpVar.c) && this.d.equals(mxpVar.d) && this.e.equals(mxpVar.e) && this.f == mxpVar.f && this.g == mxpVar.g && Float.compare(this.h, mxpVar.h) == 0 && Float.compare(this.i, mxpVar.i) == 0 && Float.compare(this.j, mxpVar.j) == 0 && this.k.equals(mxpVar.k) && this.l.equals(mxpVar.l) && this.m.equals(mxpVar.m) && this.n.equals(mxpVar.n) && this.o.equals(mxpVar.o) && this.p == mxpVar.p && this.q == mxpVar.q && this.r == mxpVar.r && this.s == mxpVar.s && this.t == mxpVar.t && Float.compare(this.u, mxpVar.u) == 0 && Float.compare(this.v, mxpVar.v) == 0 && Float.compare(this.w, mxpVar.w) == 0 && Float.compare(this.x, mxpVar.x) == 0 && Float.compare(this.y, mxpVar.y) == 0 && Float.compare(this.z, mxpVar.z) == 0 && Float.compare(this.A, mxpVar.A) == 0 && this.B.equals(mxpVar.B) && Float.compare(this.C, mxpVar.C) == 0 && this.D == mxpVar.D && this.E == mxpVar.E && Float.compare(this.F, mxpVar.F) == 0 && this.G == mxpVar.G && this.H == mxpVar.H && this.I == mxpVar.I && this.J == mxpVar.J && this.K.equals(mxpVar.K) && this.L.equals(mxpVar.L) && this.M.equals(mxpVar.M) && this.N == mxpVar.N && Float.compare(this.O, mxpVar.O) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.O) + twn.a(this.N, (this.M.hashCode() + ((this.L.hashCode() + ((this.K.hashCode() + twn.a(this.J, twn.a(this.I, twn.a(this.H, twn.a(this.G, defpackage.c.a(twn.a(this.E, twn.a(this.D, defpackage.c.a(ua80.b(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(twn.a(this.t, twn.a(this.s, twn.a(this.r, twn.a(this.q, twn.a(this.p, ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(defpackage.c.a(defpackage.c.a(defpackage.c.a((this.g.hashCode() + twn.a(this.f, ua80.b(ua80.b(ua80.b(twn.a(this.b, Long.hashCode(this.f22568a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31)) * 31, this.h, 31), this.i, 31), this.j, 31), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31), 31), 31), 31), 31), this.u, 31), this.v, 31), this.w, 31), this.x, 31), this.y, 31), this.z, 31), this.A, 31), 31, this.B), this.C, 31), 31), 31), this.F, 31), 31), 31), 31), 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f22568a, "FighterStatisticModel(feedId=", ", id=");
        f140.v(sbQ, ", feedName=", this.c, ", firstName=", this.d);
        axq.s(this.f, ", lastName=", this.e, ", age=", sbQ);
        sbQ.append(", weightClass=");
        sbQ.append(this.g);
        sbQ.append(", heightMetric=");
        sbQ.append(this.h);
        sbQ.append(", weightMetric=");
        sbQ.append(this.i);
        sbQ.append(", armReachMetric=");
        sbQ.append(this.j);
        f140.v(sbQ, ", cityOfBirth=", this.k, ", countryOfBirth=", this.l);
        f140.v(sbQ, ", countryImageS3=", this.m, ", rank=", this.n);
        axq.s(this.p, ", imageS3=", this.o, ", wins=", sbQ);
        rw2.s(this.q, this.r, ", losses=", ", draws=", sbQ);
        rw2.s(this.s, this.t, ", winsByKo=", ", winsBySubmission=", sbQ);
        sbQ.append(", sigStrikesAccuracy=");
        sbQ.append(this.u);
        sbQ.append(", sigStrikesPerMin=");
        sbQ.append(this.v);
        sbQ.append(", sigStrikesAbsorbed=");
        sbQ.append(this.w);
        sbQ.append(", sigStrikeDefence=");
        sbQ.append(this.x);
        sbQ.append(", takedownAccuracy=");
        sbQ.append(this.y);
        sbQ.append(", takedownAvg=");
        sbQ.append(this.z);
        sbQ.append(", takedownDefence=");
        sbQ.append(this.A);
        sbQ.append(", fightingStyle=");
        sbQ.append(this.B);
        sbQ.append(", legReachMetric=");
        sbQ.append(this.C);
        sbQ.append(", sigStrikesLanded=");
        sbQ.append(this.D);
        sbQ.append(", sigStrikesAttempted=");
        sbQ.append(this.E);
        sbQ.append(", knockdownAvg=");
        sbQ.append(this.F);
        rw2.s(this.G, this.H, ", takedownLanded=", ", takedownAttempted=", sbQ);
        rw2.s(this.I, this.J, ", avgFightTime=", ", firstRoundFinishes=", sbQ);
        sbQ.append(", strikePosition=");
        sbQ.append(this.K);
        sbQ.append(", strikeTarget=");
        sbQ.append(this.L);
        sbQ.append(", winMethods=");
        sbQ.append(this.M);
        sbQ.append(", pfpRank=");
        sbQ.append(this.N);
        sbQ.append(", submissionAvg=");
        sbQ.append(this.O);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
