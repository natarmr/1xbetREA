package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class a95 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f460a;
    public final String b;
    public final String c;

    public a95(double d, String str, String str2) {
        this.f460a = d;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a95)) {
            return false;
        }
        a95 a95Var = (a95) obj;
        return Double.compare(this.f460a, a95Var.f460a) == 0 && this.b.equals(a95Var.b) && this.c.equals(a95Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Double.hashCode(this.f460a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(vqd.s("AvailableValueModel(value=", this.f460a, ", measure=", this.b), ", valueView=", this.c, Separators.RPAREN);
    }
}
