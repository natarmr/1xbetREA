package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class w580 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38571a;
    public final String b;
    public final String c;

    public w580(int i, String str, String str2) {
        this.f38571a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w580)) {
            return false;
        }
        w580 w580Var = (w580) obj;
        return this.f38571a == w580Var.f38571a && this.b.equals(w580Var.b) && this.c.equals(w580Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f38571a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f38571a, "OppsModel(id=", ", name=", this.b, ", image="), this.c, Separators.RPAREN);
    }
}
