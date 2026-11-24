package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ytm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43225a;
    public final boolean b;
    public final String c;
    public final long d;
    public final c280 e;
    public final c280 f;
    public final String g;
    public final boolean h;
    public final String i;
    public final long j;
    public final String k;
    public final String l;
    public final String m;

    public ytm(String str, boolean z, String str2, long j, c280 c280Var, c280 c280Var2, String str3, boolean z2, String str4, long j2, String str5, String str6, String str7) {
        ohs0.z(str, str2, str3, str4, str5);
        this.f43225a = str;
        this.b = z;
        this.c = str2;
        this.d = j;
        this.e = c280Var;
        this.f = c280Var2;
        this.g = str3;
        this.h = z2;
        this.i = str4;
        this.j = j2;
        this.k = str5;
        this.l = str6;
        this.m = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytm)) {
            return false;
        }
        ytm ytmVar = (ytm) obj;
        if (!Intrinsics.d(this.f43225a, ytmVar.f43225a) || this.b != ytmVar.b || !Intrinsics.d(this.c, ytmVar.c)) {
            return false;
        }
        long j = ytmVar.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && this.e.equals(ytmVar.e) && this.f.equals(ytmVar.f) && Intrinsics.d(this.g, ytmVar.g) && this.h == ytmVar.h && Intrinsics.d(this.i, ytmVar.i) && h2t0.a(this.j, ytmVar.j) && Intrinsics.d(this.k, ytmVar.k) && this.l.equals(ytmVar.l) && this.m.equals(ytmVar.m);
    }

    public final int hashCode() {
        int iB = ua80.b(brm0.e(this.f43225a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.m.hashCode() + ua80.b(ua80.b(rw2.b(ua80.b(brm0.e(ua80.b(hne.g(this.f, hne.g(this.e, rw2.b(iB, 31, this.d), 31), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        String strI = y3d.i(this.d);
        String strI2 = y3d.i(this.j);
        StringBuilder sbU = brm0.u("V2(teamOneName=", this.f43225a, ", teamOneRedIndicator=", this.b, ", teamOneScore=");
        f140.v(sbU, this.c, ", teamOneScoreColor=", strI, ", teamOneLogo=");
        f140.u(sbU, this.e, ", teamTwoLogo=", this.f, ", teamTwoName=");
        brm0.C(this.g, ", teamTwoRedIndicator=", ", teamTwoScore=", sbU, this.h);
        f140.v(sbU, this.i, ", teamTwoScoreColor=", strI2, ", infoLabel=");
        f140.v(sbU, this.k, ", seedingLeft=", this.l, ", seedingRight=");
        return axq.n(sbU, this.m, Separators.RPAREN);
    }
}
