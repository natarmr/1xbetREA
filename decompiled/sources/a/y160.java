package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class y160 implements b260 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f41840a;
    public final m97 b;

    public y160(m0k0 m0k0Var, m97 m97Var) {
        this.f41840a = m0k0Var;
        this.b = m97Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y160)) {
            return false;
        }
        y160 y160Var = (y160) obj;
        return this.f41840a.equals(y160Var.f41840a) && this.b.equals(y160Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41840a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowMakeBetDialog(singleBetGame=" + this.f41840a + ", betInfo=" + this.b + Separators.RPAREN;
    }
}
