package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hmm0 implements nmm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13316a;
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
    public final qgm l;
    public final qgm m;

    public hmm0(String str, String str2, long j, c280 c280Var, c280 c280Var2, String str3, String str4, long j2, String str5, String str6, String str7, qgm qgmVar, qgm qgmVar2) {
        ohs0.z(str, str2, str3, str4, str5);
        this.f13316a = str;
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
        this.l = qgmVar;
        this.m = qgmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmm0)) {
            return false;
        }
        hmm0 hmm0Var = (hmm0) obj;
        if (!Intrinsics.d(this.f13316a, hmm0Var.f13316a) || !Intrinsics.d(this.b, hmm0Var.b)) {
            return false;
        }
        long j = hmm0Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && this.d.equals(hmm0Var.d) && this.e.equals(hmm0Var.e) && Intrinsics.d(this.f, hmm0Var.f) && Intrinsics.d(this.g, hmm0Var.g) && h2t0.a(this.h, hmm0Var.h) && Intrinsics.d(this.i, hmm0Var.i) && this.j.equals(hmm0Var.j) && this.k.equals(hmm0Var.k) && this.l.equals(hmm0Var.l) && this.m.equals(hmm0Var.m);
    }

    public final int hashCode() {
        int iB = ua80.b(brm0.e(this.f13316a.hashCode() * 31, 31, false), 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.m.f28692a.hashCode() + ((this.l.f28692a.hashCode() + ua80.b(ua80.b(ua80.b(rw2.b(ua80.b(brm0.e(ua80.b(hne.g(this.e, hne.g(this.d, rw2.b(iB, 31, this.c), 31), 31), 31, this.f), 31, false), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31);
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        String strI2 = y3d.i(this.h);
        StringBuilder sbN = b1j.n("Cricket(teamOneName=", this.f13316a, ", teamOneRedIndicator=false, teamOneScore=", this.b, ", teamOneScoreColor=");
        sbN.append(strI);
        sbN.append(", teamOneLogo=");
        sbN.append(this.d);
        sbN.append(", teamTwoLogo=");
        sbN.append(this.e);
        sbN.append(", teamTwoName=");
        sbN.append(this.f);
        sbN.append(", teamTwoRedIndicator=false, teamTwoScore=");
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
