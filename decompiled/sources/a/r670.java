package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r670 implements y670 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csr f29922a;
    public final long b;

    public r670(long j, csr csrVar) {
        this.f29922a = csrVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r670)) {
            return false;
        }
        r670 r670Var = (r670) obj;
        return this.f29922a.equals(r670Var.f29922a) && this.b == r670Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f29922a.hashCode() * 31);
    }

    public final String toString() {
        return "OnBonusChange(bonus=" + this.f29922a + ", gameId=" + this.b + Separators.RPAREN;
    }
}
