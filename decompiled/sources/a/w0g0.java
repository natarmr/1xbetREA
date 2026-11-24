package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class w0g0 implements x0g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38347a = axq.g();
    public final cll0 b;

    public w0g0(cll0 cll0Var) {
        this.b = cll0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0g0)) {
            return false;
        }
        w0g0 w0g0Var = (w0g0) obj;
        return this.f38347a.equals(w0g0Var.f38347a) && this.b.equals(w0g0Var.b);
    }

    @Override // a.a2n
    public final String getKey() {
        return this + this.f38347a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38347a.hashCode() * 31);
    }

    public final String toString() {
        return "Shimmer(id=" + this.f38347a + ", type=" + this.b + Separators.RPAREN;
    }
}
