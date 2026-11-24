package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vtm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d280 f38014a;
    public final d280 b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final long h;
    public final jwm i;
    public final jwm j;

    public vtm(d280 d280Var, d280 d280Var2, String str, String str2, long j, String str3, String str4, long j2, jwm jwmVar, jwm jwmVar2) {
        cs0.x(str, str2, str3, str4);
        this.f38014a = d280Var;
        this.b = d280Var2;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = str3;
        this.g = str4;
        this.h = j2;
        this.i = jwmVar;
        this.j = jwmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtm)) {
            return false;
        }
        vtm vtmVar = (vtm) obj;
        if (!this.f38014a.equals(vtmVar.f38014a) || !this.b.equals(vtmVar.b) || !Intrinsics.d(this.c, vtmVar.c) || !Intrinsics.d(this.d, vtmVar.d)) {
            return false;
        }
        long j = vtmVar.e;
        int i = y3d.h;
        return h2t0.a(this.e, j) && Intrinsics.d(this.f, vtmVar.f) && Intrinsics.d(this.g, vtmVar.g) && h2t0.a(this.h, vtmVar.h) && this.i.equals(vtmVar.i) && Intrinsics.d(this.j, vtmVar.j);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(twn.e(this.b, this.f38014a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iD = b1j.d(this.i, rw2.b(ua80.b(ua80.b(rw2.b(iB, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31);
        jwm jwmVar = this.j;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        String strI = y3d.i(this.e);
        String strI2 = y3d.i(this.h);
        StringBuilder sb = new StringBuilder("V3(teamOneLogo=");
        sb.append(this.f38014a);
        sb.append(", teamTwoLogo=");
        sb.append(this.b);
        sb.append(", teamOneName=");
        f140.v(sb, this.c, ", teamOneScore=", this.d, ", teamOneScoreColor=");
        f140.v(sb, strI, ", teamTwoName=", this.f, ", teamTwoScore=");
        f140.v(sb, this.g, ", teamTwoScoreColor=", strI2, ", infoTwo=");
        return b1j.l(sb, this.i, ", infoThree=", this.j, Separators.RPAREN);
    }
}
