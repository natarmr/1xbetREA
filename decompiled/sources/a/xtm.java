package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xtm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41470a;
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

    public xtm(String str, String str2, long j, c280 c280Var, c280 c280Var2, String str3, String str4, long j2, String str5, String str6, String str7) {
        ohs0.z(str, str2, str3, str4, str5);
        this.f41470a = str;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtm)) {
            return false;
        }
        xtm xtmVar = (xtm) obj;
        if (!Intrinsics.d(this.f41470a, xtmVar.f41470a) || !Intrinsics.d(this.b, xtmVar.b)) {
            return false;
        }
        long j = xtmVar.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && this.d.equals(xtmVar.d) && this.e.equals(xtmVar.e) && Intrinsics.d(this.f, xtmVar.f) && Intrinsics.d(this.g, xtmVar.g) && h2t0.a(this.h, xtmVar.h) && Intrinsics.d(this.i, xtmVar.i) && this.j.equals(xtmVar.j) && this.k.equals(xtmVar.k);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f41470a.hashCode() * 31, 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.k.hashCode() + ua80.b(ua80.b(rw2.b(ua80.b(ua80.b(hne.g(this.e, hne.g(this.d, rw2.b(iB, 31, this.c), 31), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        String strI2 = y3d.i(this.h);
        StringBuilder sbN = b1j.n("Default(teamOneName=", this.f41470a, ", teamOneScore=", this.b, ", teamOneScoreColor=");
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
        return axq.n(sbN, this.k, Separators.RPAREN);
    }
}
