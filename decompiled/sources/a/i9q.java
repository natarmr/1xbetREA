package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i9q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f14399a;
    public final double b;
    public final a4x c;
    public final long d;
    public final String e;
    public final boolean f;
    public final long g;
    public final String h;
    public final long i;
    public final long j;
    public final String k;
    public final double l;
    public final String m;

    public i9q(double d, double d2, a4x a4xVar, long j, String str, boolean z, long j2, String str2, long j3, long j4, String str3, double d3, String str4) {
        a4xVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f14399a = d;
        this.b = d2;
        this.c = a4xVar;
        this.d = j;
        this.e = str;
        this.f = z;
        this.g = j2;
        this.h = str2;
        this.i = j3;
        this.j = j4;
        this.k = str3;
        this.l = d3;
        this.m = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9q)) {
            return false;
        }
        i9q i9qVar = (i9q) obj;
        return Double.compare(this.f14399a, i9qVar.f14399a) == 0 && Double.compare(this.b, i9qVar.b) == 0 && Intrinsics.d(this.c, i9qVar.c) && this.d == i9qVar.d && Intrinsics.d(this.e, i9qVar.e) && this.f == i9qVar.f && this.g == i9qVar.g && Intrinsics.d(this.h, i9qVar.h) && this.i == i9qVar.i && this.j == i9qVar.j && Intrinsics.d(this.k, i9qVar.k) && Double.compare(this.l, i9qVar.l) == 0 && Intrinsics.d(this.m, i9qVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + brm0.d(this.l, ua80.b(rw2.b(rw2.b(ua80.b(rw2.b(brm0.e(ua80.b(rw2.b(cs0.b(this.c, brm0.d(this.b, Double.hashCode(this.f14399a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.f14399a, "FinBetsChartUpdateUIModel(maxPrice=", ", minPrice=");
        sbP.append(this.b);
        sbP.append(", fullValues=");
        sbP.append(this.c);
        kng0.A(sbP, ", noBetsTime=", this.d, ", noBetsText=");
        brm0.C(this.e, ", is24HourFormat=", ", startGraphTime=", sbP, this.f);
        kng0.z(sbP, this.g, ", startTimeView=", this.h);
        kng0.A(sbP, ", startTime=", this.i, ", closeTime=");
        kng0.z(sbP, this.j, ", closeTimeView=", this.k);
        ohs0.A(sbP, this.l, ", chosenLevel=", ", chosenLevelView=");
        return axq.n(sbP, this.m, Separators.RPAREN);
    }
}
