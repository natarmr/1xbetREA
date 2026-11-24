package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class bb30 implements db30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2290a;
    public final String b;
    public final String c;
    public final String d;

    public bb30(String str, String str2, String str3, String str4) {
        this.f2290a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb30)) {
            return false;
        }
        bb30 bb30Var = (bb30) obj;
        return this.f2290a.equals(bb30Var.f2290a) && this.b.equals(bb30Var.b) && this.c.equals(bb30Var.c) && this.d.equals(bb30Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f2290a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("TwoOpponents(leftTitle=", this.f2290a, ", rightTitle=", this.b, ", leftLogo="), this.c, ", rightLogo=", this.d, Separators.RPAREN);
    }
}
