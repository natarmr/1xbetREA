package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gx7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gm7 f12063a;
    public final q57 b;
    public final b3f c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final String l;
    public final boolean m;
    public final cgx0 n;
    public final ua20 o;

    public gx7(gm7 gm7Var, q57 q57Var, b3f b3fVar, boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, boolean z6, String str2, String str3, boolean z7, cgx0 cgx0Var, ua20 ua20Var) {
        this.f12063a = gm7Var;
        this.b = q57Var;
        this.c = b3fVar;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = str2;
        this.l = str3;
        this.m = z7;
        this.n = cgx0Var;
        this.o = ua20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gx7) {
            gx7 gx7Var = (gx7) obj;
            if (this.f12063a == gx7Var.f12063a && this.b == gx7Var.b && this.c == gx7Var.c && this.d == gx7Var.d && this.e == gx7Var.e && this.f.equals(gx7Var.f) && this.g == gx7Var.g && this.h == gx7Var.h && this.i == gx7Var.i && this.j == gx7Var.j && this.k.equals(gx7Var.k) && this.l.equals(gx7Var.l) && this.m == gx7Var.m && this.n == gx7Var.n && this.o == gx7Var.o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.o.hashCode() + ((this.n.hashCode() + brm0.e(ua80.b(ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(brm0.e(brm0.e((this.c.hashCode() + ((this.b.hashCode() + (this.f12063a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BettingRemoteConfigModel(betSettingsModel=");
        sb.append(this.f12063a);
        sb.append(", betHistorySettingsModel=");
        sb.append(this.b);
        sb.append(", couponSettingsModel=");
        sb.append(this.c);
        sb.append(", hasBetConstructor=");
        sb.append(this.d);
        sb.append(", hasSectionToto=");
        f140.s(", totoName=", this.f, ", inBetSlipOnly=", sb, this.e);
        ua80.u(", isBetHistoryFreeBet=", ", hasBetslipScannerNumber=", sb, this.g, this.h);
        ua80.u(", hasBetslipScannerPhoto=", ", betHistoryWinBackBannerDeeplink=", sb, this.i, this.j);
        f140.v(sb, this.k, ", betHistoryWinBackBannerImage=", this.l, ", showMinAgeBettingAlert=");
        sb.append(this.m);
        sb.append(", hideBettingSettings=");
        sb.append(this.n);
        sb.append(", makeBetScreenStyleType=");
        sb.append(this.o);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
