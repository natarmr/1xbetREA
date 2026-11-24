package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class y9b0 extends bab0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42236a;
    public final String b;
    public final boolean c;

    public y9b0(String str, int i, boolean z) {
        this.f42236a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9b0)) {
            return false;
        }
        y9b0 y9b0Var = (y9b0) obj;
        return this.f42236a == y9b0Var.f42236a && this.b.equals(y9b0Var.b) && this.c == y9b0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Integer.hashCode(this.f42236a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f42236a, "LiveChamp(logo=", ", name=", this.b, ", selected="), this.c, Separators.RPAREN);
    }
}
