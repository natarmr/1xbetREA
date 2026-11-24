package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k86 implements r86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17858a;
    public final boolean b;
    public final String c;
    public final long d;
    public final c280 e;
    public final c280 f;
    public final String g;
    public final boolean h;
    public final String i;
    public final long j;

    public k86(String str, boolean z, String str2, long j, c280 c280Var, c280 c280Var2, String str3, boolean z2, String str4, long j2) {
        cs0.x(str, str2, str3, str4);
        this.f17858a = str;
        this.b = z;
        this.c = str2;
        this.d = j;
        this.e = c280Var;
        this.f = c280Var2;
        this.g = str3;
        this.h = z2;
        this.i = str4;
        this.j = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k86)) {
            return false;
        }
        k86 k86Var = (k86) obj;
        if (!Intrinsics.d(this.f17858a, k86Var.f17858a) || this.b != k86Var.b || !Intrinsics.d(this.c, k86Var.c)) {
            return false;
        }
        long j = k86Var.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && this.e.equals(k86Var.e) && this.f.equals(k86Var.f) && Intrinsics.d(this.g, k86Var.g) && this.h == k86Var.h && Intrinsics.d(this.i, k86Var.i) && h2t0.a(this.j, k86Var.j);
    }

    public final int hashCode() {
        int iB = ua80.b(brm0.e(this.f17858a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.j) + ua80.b(brm0.e(ua80.b(hne.g(this.f, hne.g(this.e, rw2.b(iB, 31, this.d), 31), 31), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        String strI = y3d.i(this.d);
        String strI2 = y3d.i(this.j);
        StringBuilder sbU = brm0.u("Cricket(teamOneName=", this.f17858a, ", teamOneRedIndicator=", this.b, ", teamOneScore=");
        f140.v(sbU, this.c, ", teamOneScoreColor=", strI, ", teamOneLogo=");
        f140.u(sbU, this.e, ", teamTwoLogo=", this.f, ", teamTwoName=");
        brm0.C(this.g, ", teamTwoRedIndicator=", ", teamTwoScore=", sbU, this.h);
        return ua80.m(sbU, this.i, ", teamTwoScoreColor=", strI2, Separators.RPAREN);
    }
}
