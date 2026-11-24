package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class t9b0 extends bab0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33553a;
    public final String b;
    public final boolean c;

    public t9b0(String str, int i, boolean z) {
        this.f33553a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9b0)) {
            return false;
        }
        t9b0 t9b0Var = (t9b0) obj;
        return this.f33553a == t9b0Var.f33553a && this.b.equals(t9b0Var.b) && this.c == t9b0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Integer.hashCode(this.f33553a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f33553a, "Aggregator(logo=", ", name=", this.b, ", selected="), this.c, Separators.RPAREN);
    }
}
