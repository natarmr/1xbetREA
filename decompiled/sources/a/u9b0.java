package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class u9b0 extends bab0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35276a;
    public final String b;
    public final boolean c;

    public u9b0(String str, int i, boolean z) {
        this.f35276a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9b0)) {
            return false;
        }
        u9b0 u9b0Var = (u9b0) obj;
        return this.f35276a == u9b0Var.f35276a && this.b.equals(u9b0Var.b) && this.c == u9b0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Integer.hashCode(this.f35276a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f35276a, "Cyber(logo=", ", name=", this.b, ", selected="), this.c, Separators.RPAREN);
    }
}
