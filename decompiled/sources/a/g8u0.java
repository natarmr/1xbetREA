package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class g8u0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mbu0 f10882a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;

    public g8u0(mbu0 mbu0Var, String str, String str2, String str3, boolean z, String str4, String str5) {
        this.f10882a = mbu0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8u0)) {
            return false;
        }
        g8u0 g8u0Var = (g8u0) obj;
        return this.f10882a == g8u0Var.f10882a && this.b.equals(g8u0Var.b) && this.c.equals(g8u0Var.c) && this.d.equals(g8u0Var.d) && this.e == g8u0Var.e && this.f.equals(g8u0Var.f) && this.g.equals(g8u0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(brm0.e(ua80.b(ua80.b(ua80.b(this.f10882a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerificationOptionUiModel(type=");
        sb.append(this.f10882a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", subName=");
        f140.v(sb, this.c, ", imageUrl=", this.d, ", needTintImage=");
        f140.s(", description=", this.f, ", url=", sb, this.e);
        return axq.n(sb, this.g, Separators.RPAREN);
    }
}
