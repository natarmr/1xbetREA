package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class b8i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2159a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public b8i0(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f2159a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public static b8i0 a(b8i0 b8i0Var, boolean z, int i) {
        boolean z2 = (i & 2) != 0 ? b8i0Var.b : true;
        String str = b8i0Var.c;
        String str2 = b8i0Var.d;
        String str3 = b8i0Var.e;
        String str4 = b8i0Var.f;
        b8i0Var.getClass();
        return new b8i0(str, str2, str3, str4, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8i0)) {
            return false;
        }
        b8i0 b8i0Var = (b8i0) obj;
        return this.f2159a == b8i0Var.f2159a && this.b == b8i0Var.b && this.c.equals(b8i0Var.c) && this.d.equals(b8i0Var.d) && this.e.equals(b8i0Var.e) && this.f.equals(b8i0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(brm0.e(Boolean.hashCode(this.f2159a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("SelfExclusionDisclaimerRsState(isLoading=", ", isEmpty=", ", name=", this.f2159a, this.b);
        f140.v(sbQ, this.c, ", surname=", this.d, ", inn=");
        return ua80.m(sbQ, this.e, ", email=", this.f, Separators.RPAREN);
    }
}
