package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mb5 {
    public static final mb5 e = new mb5("", "", "", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21491a;
    public final String b;
    public final String c;
    public final String d;

    public mb5(String str, String str2, String str3, String str4) {
        this.f21491a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb5)) {
            return false;
        }
        mb5 mb5Var = (mb5) obj;
        return this.f21491a.equals(mb5Var.f21491a) && this.b.equals(mb5Var.b) && this.c.equals(mb5Var.c) && this.d.equals(mb5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f21491a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("BWAAdditionalTags(afSub2=", this.f21491a, ", afSub3=", this.b, ", afSub4="), this.c, ", afSub5=", this.d, Separators.RPAREN);
    }
}
