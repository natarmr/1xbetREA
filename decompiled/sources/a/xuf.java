package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xuf {
    public static final xuf p = new xuf(0, "", "", false, 0.0d, "", 0.0d, 0.0d, 0.0d, 0, false, false, 0.0d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41508a;
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
    public final boolean o;

    public xuf(long j, String str, String str2, boolean z, double d, String str3, double d2, double d3, double d4, int i, boolean z2, boolean z3, double d5, double d6) {
        brm0.B(str, str2, str3);
        this.f41508a = j;
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
        this.o = j == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xuf)) {
            return false;
        }
        xuf xufVar = (xuf) obj;
        return this.f41508a == xufVar.f41508a && Intrinsics.d(this.b, xufVar.b) && Intrinsics.d(this.c, xufVar.c) && this.d == xufVar.d && Double.compare(this.e, xufVar.e) == 0 && Intrinsics.d(this.f, xufVar.f) && Double.compare(this.g, xufVar.g) == 0 && Double.compare(this.h, xufVar.h) == 0 && Double.compare(this.i, xufVar.i) == 0 && this.j == xufVar.j && this.k == xufVar.k && this.l == xufVar.l && Double.compare(this.m, xufVar.m) == 0 && Double.compare(this.n, xufVar.n) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.n) + brm0.d(this.m, brm0.e(brm0.e(twn.a(this.j, brm0.d(this.i, brm0.d(this.h, brm0.d(this.g, ua80.b(brm0.d(this.e, brm0.e(ua80.b(ua80.b(Long.hashCode(this.f41508a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31), 31), 31), 31), 31, this.k), 31, this.l), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f41508a, "CurrencyModel(id=", ", code=", this.b);
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
