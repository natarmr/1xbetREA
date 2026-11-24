package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vil0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37485a;
    public final long b;
    public final String c;

    public vil0(String str, int i, long j) {
        this.f37485a = i;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vil0)) {
            return false;
        }
        vil0 vil0Var = (vil0) obj;
        return this.f37485a == vil0Var.f37485a && this.b == vil0Var.b && this.c.equals(vil0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(Integer.hashCode(this.f37485a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(vqd.q(this.f37485a, this.b, "SportModel(sportIndex=", ", sportId="), ", sportName=", this.c, Separators.RPAREN);
    }
}
