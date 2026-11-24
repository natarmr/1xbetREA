package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uqo implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final chl0 f36128a;

    public uqo(chl0 chl0Var) {
        this.f36128a = chl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uqo) && this.f36128a.equals(((uqo) obj).f36128a);
    }

    public final int hashCode() {
        return this.f36128a.hashCode();
    }

    public final String toString() {
        return "SportMarket(value=" + this.f36128a + Separators.RPAREN;
    }
}
