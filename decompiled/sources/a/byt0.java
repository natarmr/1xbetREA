package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class byt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3436a;
    public final boolean b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final String h;
    public final String i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;

    public byt0(String str, boolean z, String str2, String str3, int i, int i2, int i3, String str4, String str5, int i4, int i5, int i6, int i7) {
        this.f3436a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = str4;
        this.i = str5;
        this.j = i4;
        this.k = i5;
        this.l = i6;
        this.m = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byt0)) {
            return false;
        }
        byt0 byt0Var = (byt0) obj;
        return this.f3436a.equals(byt0Var.f3436a) && this.b == byt0Var.b && this.c.equals(byt0Var.c) && this.d.equals(byt0Var.d) && this.e == byt0Var.e && this.f == byt0Var.f && this.g == byt0Var.g && this.h.equals(byt0Var.h) && this.i.equals(byt0Var.i) && this.j == byt0Var.j && this.k == byt0Var.k && this.l == byt0Var.l && this.m == byt0Var.m;
    }

    public final int hashCode() {
        return Integer.hashCode(this.m) + twn.a(this.l, twn.a(this.k, twn.a(this.j, ua80.b(ua80.b(twn.a(this.g, twn.a(this.f, twn.a(this.e, ua80.b(ua80.b(brm0.e(this.f3436a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31), 31, this.h), 31, this.i), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("ValorantPlayerStatisticModel(name=", this.f3436a, ", alive=", this.b, ", agentName=");
        f140.v(sbU, this.c, ", agentImage=", this.d, ", numberOfKills=");
        axq.r(this.e, this.f, ", numberOfAssists=", ", numberOfDeath=", sbU);
        kng0.w(this.g, ", weaponName=", this.h, ", weaponImage=", sbU);
        twn.w(this.j, this.i, ", numberOfOpenKills=", ", numberOfOpenDeath=", sbU);
        axq.r(this.k, this.l, ", numberOfMultiKills=", ", form=", sbU);
        return rz4.j(this.m, Separators.RPAREN, sbU);
    }
}
