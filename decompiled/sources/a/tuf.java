package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tuf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34547a;
    public final String b;
    public final String c;
    public final boolean d;
    public final double e;
    public final String f;
    public final double g;
    public final double h;
    public final double i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final double m;
    public final double n;

    public tuf(long j, String str, String str2, boolean z, double d, String str3, double d2, double d3, double d4, int i, boolean z2, boolean z3, double d5, double d6) {
        brm0.B(str, str2, str3);
        this.f34547a = j;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = d;
        this.f = str3;
        this.g = d2;
        this.h = d3;
        this.i = d4;
        this.j = i;
        this.k = z2;
        this.l = z3;
        this.m = d5;
        this.n = d6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tuf)) {
            return false;
        }
        tuf tufVar = (tuf) obj;
        return this.f34547a == tufVar.f34547a && Intrinsics.d(this.b, tufVar.b) && Intrinsics.d(this.c, tufVar.c) && this.d == tufVar.d && Double.compare(this.e, tufVar.e) == 0 && Intrinsics.d(this.f, tufVar.f) && Double.compare(this.g, tufVar.g) == 0 && Double.compare(this.h, tufVar.h) == 0 && Double.compare(this.i, tufVar.i) == 0 && this.j == tufVar.j && this.k == tufVar.k && this.l == tufVar.l && Double.compare(this.m, tufVar.m) == 0 && Double.compare(this.n, tufVar.n) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.n) + brm0.d(this.m, brm0.e(brm0.e(twn.a(this.j, brm0.d(this.i, brm0.d(this.h, brm0.d(this.g, ua80.b(brm0.d(this.e, brm0.e(ua80.b(ua80.b(Long.hashCode(this.f34547a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31), 31), 31), 31), 31, this.k), 31, this.l), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f34547a, "CurrencyEntity(id=", ", code=", this.b);
        w6x.z(", name=", this.c, ", top=", sbO, this.d);
        ohs0.A(sbO, this.e, ", rubleToCurrencyRate=", ", symbol=");
        hne.A(sbO, this.f, ", minOutDeposit=", this.g);
        ohs0.A(sbO, this.h, ", minOutDepositElectron=", ", minSumBet=");
        rz4.w(sbO, this.i, ", round=", this.j);
        w6x.A(", registrationHidden=", ", crypto=", sbO, this.k, this.l);
        ohs0.A(sbO, this.m, ", initialBet=", ", betStep=");
        return axq.l(sbO, this.n, Separators.RPAREN);
    }
}
