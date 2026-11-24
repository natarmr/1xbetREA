package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class eum implements fum {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8426a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final long f;
    public final c280 g;
    public final c280 h;
    public final String i;
    public final boolean j;
    public final String k;
    public final long l;
    public final stm m;

    public eum(long j, long j2, stm stmVar, c280 c280Var, c280 c280Var2, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        ohs0.z(str, str2, str3, str4, str5);
        str6.getClass();
        this.f8426a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = j;
        this.g = c280Var;
        this.h = c280Var2;
        this.i = str5;
        this.j = z2;
        this.k = str6;
        this.l = j2;
        this.m = stmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eum)) {
            return false;
        }
        eum eumVar = (eum) obj;
        if (!Intrinsics.d(this.f8426a, eumVar.f8426a) || !Intrinsics.d(this.b, eumVar.b) || !Intrinsics.d(this.c, eumVar.c) || this.d != eumVar.d || !Intrinsics.d(this.e, eumVar.e)) {
            return false;
        }
        long j = eumVar.f;
        int i = y3d.h;
        return h2t0.a(this.f, j) && this.g.equals(eumVar.g) && this.h.equals(eumVar.h) && Intrinsics.d(this.i, eumVar.i) && this.j == eumVar.j && Intrinsics.d(this.k, eumVar.k) && h2t0.a(this.l, eumVar.l) && this.m.equals(eumVar.m);
    }

    public final int hashCode() {
        int iB = ua80.b(brm0.e(ua80.b(ua80.b(this.f8426a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.m.hashCode() + rw2.b(ua80.b(brm0.e(ua80.b(hne.g(this.h, hne.g(this.g, rw2.b(iB, 31, this.f), 31), 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        String strI = y3d.i(this.f);
        String strI2 = y3d.i(this.l);
        StringBuilder sbN = b1j.n("V4(liveTag=", this.f8426a, ", infoLabel=", this.b, ", teamOneName=");
        brm0.C(this.c, ", teamOneRedIndicator=", ", teamOneScore=", sbN, this.d);
        f140.v(sbN, this.e, ", teamOneScoreColor=", strI, ", teamOneLogo=");
        f140.u(sbN, this.g, ", teamTwoLogo=", this.h, ", teamTwoName=");
        brm0.C(this.i, ", teamTwoRedIndicator=", ", teamTwoScore=", sbN, this.j);
        f140.v(sbN, this.k, ", teamTwoScoreColor=", strI2, ", options=");
        sbN.append(this.m);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
