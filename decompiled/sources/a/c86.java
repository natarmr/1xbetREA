package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c86 implements j86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3897a;
    public final String b;
    public final boolean c;
    public final String d;
    public final long e;
    public final c280 f;
    public final c280 g;
    public final String h;
    public final boolean i;
    public final String j;
    public final String k;
    public final long l;
    public final stm m;

    public c86(long j, long j2, stm stmVar, c280 c280Var, c280 c280Var2, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        ohs0.z(str, str2, str3, str4, str5);
        str6.getClass();
        this.f3897a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = j;
        this.f = c280Var;
        this.g = c280Var2;
        this.h = str4;
        this.i = z2;
        this.j = str5;
        this.k = str6;
        this.l = j2;
        this.m = stmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c86)) {
            return false;
        }
        c86 c86Var = (c86) obj;
        if (!Intrinsics.d(this.f3897a, c86Var.f3897a) || !Intrinsics.d(this.b, c86Var.b) || this.c != c86Var.c || !Intrinsics.d(this.d, c86Var.d)) {
            return false;
        }
        long j = c86Var.e;
        int i = y3d.h;
        return h2t0.a(this.e, j) && this.f.equals(c86Var.f) && this.g.equals(c86Var.g) && Intrinsics.d(this.h, c86Var.h) && this.i == c86Var.i && Intrinsics.d(this.j, c86Var.j) && Intrinsics.d(this.k, c86Var.k) && h2t0.a(this.l, c86Var.l) && this.m.equals(c86Var.m);
    }

    public final int hashCode() {
        int iB = ua80.b(brm0.e(ua80.b(this.f3897a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.m.hashCode() + rw2.b(ua80.b(ua80.b(brm0.e(ua80.b(hne.g(this.g, hne.g(this.f, rw2.b(iB, 31, this.e), 31), 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        String strI = y3d.i(this.e);
        String strI2 = y3d.i(this.l);
        StringBuilder sbN = b1j.n("Cricket(infoLabel=", this.f3897a, ", teamOneName=", this.b, ", teamOneRedIndicator=");
        f140.s(", teamOneScore=", this.d, ", teamOneScoreColor=", sbN, this.c);
        sbN.append(strI);
        sbN.append(", teamOneLogo=");
        sbN.append(this.f);
        sbN.append(", teamTwoLogo=");
        sbN.append(this.g);
        sbN.append(", teamTwoName=");
        sbN.append(this.h);
        sbN.append(", teamTwoRedIndicator=");
        f140.s(", teamTwoScore=", this.j, ", liveTag=", sbN, this.i);
        f140.v(sbN, this.k, ", teamTwoScoreColor=", strI2, ", options=");
        sbN.append(this.m);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
