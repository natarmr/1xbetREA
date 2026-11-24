package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b1s0 implements d1s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2s0 f1824a;

    public b1s0(h2s0 h2s0Var) {
        this.f1824a = h2s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1s0) && this.f1824a.equals(((b1s0) obj).f1824a);
    }

    public final int hashCode() {
        return this.f1824a.hashCode();
    }

    public final String toString() {
        return "LolModel(statistic=" + this.f1824a + Separators.RPAREN;
    }
}
