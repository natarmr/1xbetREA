package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class x9b0 extends bab0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40502a;
    public final String b;
    public final boolean c;

    public x9b0(String str, int i, boolean z) {
        this.f40502a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9b0)) {
            return false;
        }
        x9b0 x9b0Var = (x9b0) obj;
        return this.f40502a == x9b0Var.f40502a && this.b.equals(x9b0Var.b) && this.c == x9b0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Integer.hashCode(this.f40502a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f40502a, "LineGames(logo=", ", name=", this.b, ", selected="), this.c, Separators.RPAREN);
    }
}
