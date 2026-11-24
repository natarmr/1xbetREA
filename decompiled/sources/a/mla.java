package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mla implements nla {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21979a = axq.g();
    public final ull0 b;

    public mla(ull0 ull0Var) {
        this.b = ull0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mla)) {
            return false;
        }
        mla mlaVar = (mla) obj;
        return this.f21979a.equals(mlaVar.f21979a) && this.b.equals(mlaVar.b);
    }

    @Override // a.a2n
    public final String getKey() {
        return this + this.f21979a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21979a.hashCode() * 31);
    }

    public final String toString() {
        return "Shimmer(id=" + this.f21979a + ", type=" + this.b + Separators.RPAREN;
    }
}
