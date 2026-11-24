package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mlm0 implements slm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21998a;
    public final String b;
    public final long c;
    public final c280 d;
    public final c280 e;
    public final String f;
    public final String g;
    public final long h;
    public final String i;
    public final String j;
    public final String k;
    public final kgm l;
    public final kgm m;

    public mlm0(String str, String str2, long j, c280 c280Var, c280 c280Var2, String str3, String str4, long j2, String str5, String str6, String str7, kgm kgmVar, kgm kgmVar2) {
        ohs0.z(str, str2, str3, str4, str5);
        this.f21998a = str;
        this.b = str2;
        this.c = j;
        this.d = c280Var;
        this.e = c280Var2;
        this.f = str3;
        this.g = str4;
        this.h = j2;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = kgmVar;
        this.m = kgmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlm0)) {
            return false;
        }
        mlm0 mlm0Var = (mlm0) obj;
        if (!Intrinsics.d(this.f21998a, mlm0Var.f21998a) || !Intrinsics.d(this.b, mlm0Var.b)) {
            return false;
        }
        long j = mlm0Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && this.d.equals(mlm0Var.d) && this.e.equals(mlm0Var.e) && Intrinsics.d(this.f, mlm0Var.f) && Intrinsics.d(this.g, mlm0Var.g) && h2t0.a(this.h, mlm0Var.h) && Intrinsics.d(this.i, mlm0Var.i) && this.j.equals(mlm0Var.j) && this.k.equals(mlm0Var.k) && this.l.equals(mlm0Var.l) && this.m.equals(mlm0Var.m);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f21998a.hashCode() * 31, 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.m.f18246a.hashCode() + ((this.l.f18246a.hashCode() + ua80.b(ua80.b(ua80.b(rw2.b(ua80.b(ua80.b(hne.g(this.e, hne.g(this.d, rw2.b(iB, 31, this.c), 31), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31);
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        String strI2 = y3d.i(this.h);
        StringBuilder sbN = b1j.n("Cricket(teamOneName=", this.f21998a, ", teamOneScore=", this.b, ", teamOneScoreColor=");
        sbN.append(strI);
        sbN.append(", teamOneLogo=");
        sbN.append(this.d);
        sbN.append(", teamTwoLogo=");
        sbN.append(this.e);
        sbN.append(", teamTwoName=");
        sbN.append(this.f);
        sbN.append(", teamTwoScore=");
        f140.v(sbN, this.g, ", teamTwoScoreColor=", strI2, ", infoLabel=");
        f140.v(sbN, this.i, ", seedingLeft=", this.j, ", seedingRight=");
        sbN.append(this.k);
        sbN.append(", startResultIndicator=");
        sbN.append(this.l);
        sbN.append(", endResultIndicator=");
        sbN.append(this.m);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
