package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class u0m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34860a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final long h;
    public final lho i;
    public final int j;
    public final long k;
    public final String l;
    public final String m;

    public u0m0(String str, String str2, String str3, int i, int i2, String str4, String str5, long j, lho lhoVar, int i3, long j2) {
        this.f34860a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = str4;
        this.g = str5;
        this.h = j;
        this.i = lhoVar;
        this.j = i3;
        this.k = j2;
        this.l = i != -1 ? String.valueOf(i) : str4;
        this.m = i2 != -1 ? String.valueOf(i2) : str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0m0)) {
            return false;
        }
        u0m0 u0m0Var = (u0m0) obj;
        return this.f34860a.equals(u0m0Var.f34860a) && this.b.equals(u0m0Var.b) && this.c.equals(u0m0Var.c) && this.d == u0m0Var.d && this.e == u0m0Var.e && this.f.equals(u0m0Var.f) && this.g.equals(u0m0Var.g) && this.h == u0m0Var.h && this.i == u0m0Var.i && this.j == u0m0Var.j && this.k == u0m0Var.k;
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + twn.a(this.j, (this.i.hashCode() + rw2.b(ua80.b(ua80.b(twn.a(this.e, twn.a(this.d, ua80.b(ua80.b(this.f34860a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31, this.g), 31, this.h)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("StageNetGameModel(id=", this.f34860a, ", firstTeamId=", this.b, ", secondTeamId=");
        twn.w(this.d, this.c, ", firstTeamScore=", ", secondTeamScore=", sbN);
        kng0.w(this.e, ", firstTeamStringScore=", this.f, ", secondTeamStringScore=", sbN);
        defpackage.c.i(sbN, this.h, this.g, ", dataStart=");
        sbN.append(", status=");
        sbN.append(this.i);
        sbN.append(", winner=");
        sbN.append(this.j);
        return rw2.n(sbN, this.k, ", feedGameId=", Separators.RPAREN);
    }
}
