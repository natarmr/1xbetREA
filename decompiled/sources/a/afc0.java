package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class afc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f772a;
    public final double b;
    public final String c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final cfc0 h;
    public final cfc0 i;
    public final String j;
    public final int k;

    public afc0(String str, double d, String str2, long j, long j2, int i, int i2, cfc0 cfc0Var, cfc0 cfc0Var2, String str3, int i3) {
        this.f772a = str;
        this.b = d;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = i;
        this.g = i2;
        this.h = cfc0Var;
        this.i = cfc0Var2;
        this.j = str3;
        this.k = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afc0)) {
            return false;
        }
        afc0 afc0Var = (afc0) obj;
        return this.f772a.equals(afc0Var.f772a) && Double.compare(this.b, afc0Var.b) == 0 && this.c.equals(afc0Var.c) && this.d == afc0Var.d && this.e == afc0Var.e && this.f == afc0Var.f && this.g == afc0Var.g && this.h.equals(afc0Var.h) && this.i.equals(afc0Var.i) && this.j.equals(afc0Var.j) && this.k == afc0Var.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + ua80.b((this.i.hashCode() + ((this.h.hashCode() + twn.a(this.g, twn.a(this.f, rw2.b(rw2.b(ua80.b(brm0.d(this.b, this.f772a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31), 31)) * 31)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoCodeModel(promoCodeName=");
        sb.append(this.f772a);
        sb.append(", promoCodeAmount=");
        sb.append(this.b);
        hne.B(sb, ", currency=", this.c, ", promoCodeDateOfUse=");
        sb.append(this.d);
        kng0.A(sb, ", promoCodeDateOfUseBefore=", this.e, ", promoCodeSection=");
        axq.r(this.f, this.g, ", promoCodeStatus=", ", couponType=", sb);
        sb.append(this.h);
        sb.append(", minCoef=");
        sb.append(this.i);
        sb.append(", shopName=");
        return brm0.j(this.k, this.j, ", payoutType=", Separators.RPAREN, sb);
    }
}
