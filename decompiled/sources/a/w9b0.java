package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class w9b0 extends bab0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38771a;
    public final String b;
    public final boolean c;

    public w9b0(String str, int i, boolean z) {
        this.f38771a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9b0)) {
            return false;
        }
        w9b0 w9b0Var = (w9b0) obj;
        return this.f38771a == w9b0Var.f38771a && this.b.equals(w9b0Var.b) && this.c == w9b0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Integer.hashCode(this.f38771a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f38771a, "LineChamp(logo=", ", name=", this.b, ", selected="), this.c, Separators.RPAREN);
    }
}
