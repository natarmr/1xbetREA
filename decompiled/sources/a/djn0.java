package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class djn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6197a;
    public final String b;
    public final int c;

    public djn0(int i, String str, String str2) {
        this.f6197a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djn0)) {
            return false;
        }
        djn0 djn0Var = (djn0) obj;
        return this.f6197a.equals(djn0Var.f6197a) && this.b.equals(djn0Var.b) && this.c == djn0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f6197a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("SupportItemModel(name=", this.f6197a, ", image=", this.b, ", count="));
    }
}
