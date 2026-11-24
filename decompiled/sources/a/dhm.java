package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dhm implements ghm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6097a;
    public final String b;
    public final d280 c;
    public final String d;
    public final d280 e;
    public final String f;
    public final String g;
    public final lpm h;
    public final boolean i;
    public final String j;
    public final long k;
    public final n0x l;

    public dhm(long j, String str, d280 d280Var, String str2, d280 d280Var2, String str3, String str4, lpm lpmVar, boolean z, String str5, long j2, n0x n0xVar) {
        str3.getClass();
        str4.getClass();
        this.f6097a = j;
        this.b = str;
        this.c = d280Var;
        this.d = str2;
        this.e = d280Var2;
        this.f = str3;
        this.g = str4;
        this.h = lpmVar;
        this.i = z;
        this.j = str5;
        this.k = j2;
        this.l = n0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhm)) {
            return false;
        }
        dhm dhmVar = (dhm) obj;
        if (this.f6097a != dhmVar.f6097a || !this.b.equals(dhmVar.b) || !this.c.equals(dhmVar.c) || !this.d.equals(dhmVar.d) || !this.e.equals(dhmVar.e) || !Intrinsics.d(this.f, dhmVar.f) || !Intrinsics.d(this.g, dhmVar.g) || !this.h.equals(dhmVar.h) || this.i != dhmVar.i || !this.j.equals(dhmVar.j)) {
            return false;
        }
        long j = dhmVar.k;
        int i = y3d.h;
        return h2t0.a(this.k, j) && this.l.equals(dhmVar.l);
    }

    public final int hashCode() {
        int iB = ua80.b(brm0.e(f140.e(this.h, ua80.b(ua80.b(twn.e(this.e, ua80.b(twn.e(this.c, ua80.b(Long.hashCode(this.f6097a) * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f), 31, this.g), 31), 31, this.i), 31, this.j);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.l.hashCode() + rw2.b(iB, 31, this.k);
    }

    public final String toString() {
        String strI = y3d.i(this.k);
        StringBuilder sbO = axq.o(this.f6097a, "Data(gameId=", ", teamOneCoeff=", this.b);
        sbO.append(", teamOneLogo=");
        sbO.append(this.c);
        sbO.append(", teamTwoCoeff=");
        sbO.append(this.d);
        sbO.append(", teamTwoLogo=");
        sbO.append(this.e);
        sbO.append(", date=");
        sbO.append(this.f);
        sbO.append(", time=");
        sbO.append(this.g);
        sbO.append(", score=");
        sbO.append(this.h);
        hne.u(", supportRtl=", ", championshipLabel=", this.j, sbO, this.i);
        sbO.append(", sportIconTint=");
        sbO.append(strI);
        sbO.append(", sportIcon=");
        sbO.append(this.l);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
