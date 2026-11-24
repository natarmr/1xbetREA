package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class x700 implements y700 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40389a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;

    public x700(long j, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        this.f40389a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = z;
        this.i = z2;
    }

    @Override // a.y700
    public final boolean a() {
        return this.h;
    }

    @Override // a.y700
    public final boolean b() {
        return this.i;
    }

    @Override // a.y700
    public final String c() {
        return this.c;
    }

    @Override // a.y700
    public final String d() {
        return this.e;
    }

    @Override // a.y700
    public final long e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x700)) {
            return false;
        }
        x700 x700Var = (x700) obj;
        return this.f40389a.equals(x700Var.f40389a) && znq0.e(this.b, x700Var.b) && this.c.equals(x700Var.c) && this.d.equals(x700Var.d) && this.e.equals(x700Var.e) && this.f.equals(x700Var.f) && this.g.equals(x700Var.g) && this.h == x700Var.h && this.i == x700Var.i;
    }

    @Override // a.y700
    public final String f() {
        return this.g;
    }

    @Override // a.y700
    public final String g() {
        return this.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(this.f40389a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    @Override // a.y700
    public final String i() {
        return this.f40389a;
    }

    @Override // a.y700
    public final String j() {
        return this.d;
    }

    public final String toString() {
        String strH = znq0.h(this.b);
        String strD0 = x9x.d0(this.g);
        StringBuilder sbN = b1j.n("TeamTwoPreviousMatch(statGameId=", this.f40389a, ", date=", strH, ", teamOneImgUrl=");
        f140.v(sbN, this.c, ", teamOneName=", this.d, ", teamTwoImgUrl=");
        f140.v(sbN, this.e, ", teamTwoName=", this.f, ", score=");
        brm0.C(strD0, ", isTeamOneWinnerIndicatorVisible=", ", isTeamTwoWinnerIndicatorVisible=", sbN, this.h);
        return rw2.p(sbN, this.i, Separators.RPAREN);
    }
}
