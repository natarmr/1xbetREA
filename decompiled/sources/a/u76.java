package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u76 implements b86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35168a;
    public final String b;
    public final String c;
    public final long d;
    public final c280 e;
    public final c280 f;
    public final String g;
    public final String h;
    public final long i;
    public final stm j;

    public u76(String str, String str2, String str3, long j, c280 c280Var, c280 c280Var2, String str4, String str5, long j2, stm stmVar) {
        ohs0.z(str, str2, str3, str4, str5);
        this.f35168a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = c280Var;
        this.f = c280Var2;
        this.g = str4;
        this.h = str5;
        this.i = j2;
        this.j = stmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u76)) {
            return false;
        }
        u76 u76Var = (u76) obj;
        if (!Intrinsics.d(this.f35168a, u76Var.f35168a) || !Intrinsics.d(this.b, u76Var.b) || !Intrinsics.d(this.c, u76Var.c)) {
            return false;
        }
        long j = u76Var.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && this.e.equals(u76Var.e) && this.f.equals(u76Var.f) && Intrinsics.d(this.g, u76Var.g) && Intrinsics.d(this.h, u76Var.h) && h2t0.a(this.i, u76Var.i) && this.j.equals(u76Var.j);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(this.f35168a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.j.hashCode() + rw2.b(ua80.b(ua80.b(hne.g(this.f, hne.g(this.e, rw2.b(iB, 31, this.d), 31), 31), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        String strI = y3d.i(this.d);
        String strI2 = y3d.i(this.i);
        StringBuilder sbN = b1j.n("Cricket(infoLabel=", this.f35168a, ", teamOneName=", this.b, ", teamOneScore=");
        f140.v(sbN, this.c, ", teamOneScoreColor=", strI, ", teamOneLogo=");
        f140.u(sbN, this.e, ", teamTwoLogo=", this.f, ", teamTwoName=");
        f140.v(sbN, this.g, ", teamTwoScore=", this.h, ", teamTwoScoreColor=");
        sbN.append(strI2);
        sbN.append(", options=");
        sbN.append(this.j);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
