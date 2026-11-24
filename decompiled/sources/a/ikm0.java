package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ikm0 implements okm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14934a;
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

    public ikm0(String str, boolean z, String str2, long j, c280 c280Var, c280 c280Var2, String str3, boolean z2, String str4, long j2, String str5, String str6, String str7) {
        ohs0.z(str, str2, str3, str4, str5);
        this.f14934a = str;
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
        if (!(obj instanceof ikm0)) {
            return false;
        }
        ikm0 ikm0Var = (ikm0) obj;
        if (!Intrinsics.d(this.f14934a, ikm0Var.f14934a) || this.b != ikm0Var.b || !Intrinsics.d(this.c, ikm0Var.c)) {
            return false;
        }
        long j = ikm0Var.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && this.e.equals(ikm0Var.e) && this.f.equals(ikm0Var.f) && Intrinsics.d(this.g, ikm0Var.g) && this.h == ikm0Var.h && Intrinsics.d(this.i, ikm0Var.i) && h2t0.a(this.j, ikm0Var.j) && Intrinsics.d(this.k, ikm0Var.k) && this.l.equals(ikm0Var.l) && this.m.equals(ikm0Var.m);
    }

    public final int hashCode() {
        int iB = ua80.b(brm0.e(this.f14934a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.m.hashCode() + ua80.b(ua80.b(rw2.b(ua80.b(brm0.e(ua80.b(hne.g(this.f, hne.g(this.e, rw2.b(iB, 31, this.d), 31), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        String strI = y3d.i(this.d);
        String strI2 = y3d.i(this.j);
        StringBuilder sbU = brm0.u("Cricket(teamOneName=", this.f14934a, ", teamOneRedIndicator=", this.b, ", teamOneScore=");
        f140.v(sbU, this.c, ", teamOneScoreColor=", strI, ", teamOneLogo=");
        f140.u(sbU, this.e, ", teamTwoLogo=", this.f, ", teamTwoName=");
        brm0.C(this.g, ", teamTwoRedIndicator=", ", teamTwoScore=", sbU, this.h);
        f140.v(sbU, this.i, ", teamTwoScoreColor=", strI2, ", infoLabel=");
        f140.v(sbU, this.k, ", seedingLeft=", this.l, ", seedingRight=");
        return axq.n(sbU, this.m, Separators.RPAREN);
    }
}
