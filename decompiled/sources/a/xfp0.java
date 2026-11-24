package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xfp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40802a;
    public final int b;
    public final String c;
    public final String d;

    public xfp0(String str, int i, String str2, String str3) {
        this.f40802a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfp0)) {
            return false;
        }
        xfp0 xfp0Var = (xfp0) obj;
        return this.f40802a.equals(xfp0Var.f40802a) && this.b == xfp0Var.b && this.c.equals(xfp0Var.c) && this.d.equals(xfp0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(twn.a(this.b, this.f40802a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return ua80.m(kng0.p(this.b, "TeamModel(id=", this.f40802a, ", teamClId=", ", image="), this.c, ", title=", this.d, Separators.RPAREN);
    }
}
