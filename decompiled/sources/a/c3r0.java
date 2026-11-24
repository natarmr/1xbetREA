package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class c3r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3693a;
    public final String b;
    public final String c;

    public c3r0(int i, String str, String str2) {
        this.f3693a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3r0)) {
            return false;
        }
        c3r0 c3r0Var = (c3r0) obj;
        return this.f3693a == c3r0Var.f3693a && this.b.equals(c3r0Var.b) && this.c.equals(c3r0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f3693a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f3693a, "TopEventLegendModel(id=", ", alias=", this.b, ", fullName="), this.c, Separators.RPAREN);
    }
}
