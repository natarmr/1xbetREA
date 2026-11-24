package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class cb30 implements db30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4044a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public cb30(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f4044a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb30)) {
            return false;
        }
        cb30 cb30Var = (cb30) obj;
        return this.f4044a.equals(cb30Var.f4044a) && this.b.equals(cb30Var.b) && this.c.equals(cb30Var.c) && this.d.equals(cb30Var.d) && this.e.equals(cb30Var.e) && this.f.equals(cb30Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(this.f4044a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TwoPairs(leftPairTitle=", this.f4044a, ", rightPairTitle=", this.b, ", leftFirstLogo=");
        f140.v(sbN, this.c, ", leftSecondLogo=", this.d, ", rightFirstLogo=");
        return ua80.m(sbN, this.e, ", rightSecondLogo=", this.f, Separators.RPAREN);
    }
}
