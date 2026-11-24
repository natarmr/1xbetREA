package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s86 implements z86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31788a;
    public final String b;
    public final boolean c;
    public final String d;
    public final long e;
    public final c280 f;
    public final c280 g;
    public final String h;
    public final boolean i;
    public final String j;
    public final long k;
    public final f2i l;
    public final String m;
    public final stm n;

    public s86(String str, String str2, boolean z, String str3, long j, c280 c280Var, c280 c280Var2, String str4, boolean z2, String str5, long j2, f2i f2iVar, String str6, stm stmVar) {
        ohs0.z(str, str2, str3, str4, str5);
        str6.getClass();
        this.f31788a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = j;
        this.f = c280Var;
        this.g = c280Var2;
        this.h = str4;
        this.i = z2;
        this.j = str5;
        this.k = j2;
        this.l = f2iVar;
        this.m = str6;
        this.n = stmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s86)) {
            return false;
        }
        s86 s86Var = (s86) obj;
        if (!Intrinsics.d(this.f31788a, s86Var.f31788a) || !Intrinsics.d(this.b, s86Var.b) || this.c != s86Var.c || !Intrinsics.d(this.d, s86Var.d)) {
            return false;
        }
        long j = s86Var.e;
        int i = y3d.h;
        return h2t0.a(this.e, j) && this.f.equals(s86Var.f) && this.g.equals(s86Var.g) && Intrinsics.d(this.h, s86Var.h) && this.i == s86Var.i && Intrinsics.d(this.j, s86Var.j) && h2t0.a(this.k, s86Var.k) && Intrinsics.d(this.l, s86Var.l) && Intrinsics.d(this.m, s86Var.m) && this.n.equals(s86Var.n);
    }

    public final int hashCode() {
        int iB = ua80.b(brm0.e(ua80.b(this.f31788a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iB2 = rw2.b(ua80.b(brm0.e(ua80.b(hne.g(this.g, hne.g(this.f, rw2.b(iB, 31, this.e), 31), 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        f2i f2iVar = this.l;
        return this.n.hashCode() + ua80.b((iB2 + (f2iVar == null ? 0 : f2iVar.hashCode())) * 31, 31, this.m);
    }

    public final String toString() {
        String strI = y3d.i(this.e);
        String strI2 = y3d.i(this.k);
        StringBuilder sbN = b1j.n("Cricket(infoLabel=", this.f31788a, ", teamOneName=", this.b, ", teamOneRedIndicator=");
        f140.s(", teamOneScore=", this.d, ", teamOneScoreColor=", sbN, this.c);
        sbN.append(strI);
        sbN.append(", teamOneLogo=");
        sbN.append(this.f);
        sbN.append(", teamTwoLogo=");
        sbN.append(this.g);
        sbN.append(", teamTwoName=");
        sbN.append(this.h);
        sbN.append(", teamTwoRedIndicator=");
        f140.s(", teamTwoScore=", this.j, ", teamTwoScoreColor=", sbN, this.i);
        sbN.append(strI2);
        sbN.append(", broadcastIndicatorModel=");
        sbN.append(this.l);
        sbN.append(", tagLiveText=");
        sbN.append(this.m);
        sbN.append(", options=");
        sbN.append(this.n);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
