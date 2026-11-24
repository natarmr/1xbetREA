package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class v9b0 extends bab0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37027a;
    public final String b;
    public final boolean c;

    public v9b0(String str, int i, boolean z) {
        this.f37027a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9b0)) {
            return false;
        }
        v9b0 v9b0Var = (v9b0) obj;
        return this.f37027a == v9b0Var.f37027a && this.b.equals(v9b0Var.b) && this.c == v9b0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Integer.hashCode(this.f37027a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f37027a, "DayExpress(logo=", ", name=", this.b, ", selected="), this.c, Separators.RPAREN);
    }
}
