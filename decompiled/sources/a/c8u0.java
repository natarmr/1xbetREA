package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class c8u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mbu0 f3933a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public c8u0(mbu0 mbu0Var, String str, String str2, String str3, String str4, String str5) {
        this.f3933a = mbu0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8u0)) {
            return false;
        }
        c8u0 c8u0Var = (c8u0) obj;
        return this.f3933a == c8u0Var.f3933a && this.b.equals(c8u0Var.b) && this.c.equals(c8u0Var.c) && this.d.equals(c8u0Var.d) && this.e.equals(c8u0Var.e) && this.f.equals(c8u0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(this.f3933a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerificationOptionModel(type=");
        sb.append(this.f3933a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", subName=");
        f140.v(sb, this.c, ", imageUrl=", this.d, ", description=");
        return ua80.m(sb, this.e, ", url=", this.f, Separators.RPAREN);
    }
}
