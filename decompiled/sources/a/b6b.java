package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class b6b implements d6b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kv20 f2043a;

    public b6b(kv20 kv20Var) {
        this.f2043a = kv20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b6b) && this.f2043a.equals(((b6b) obj).f2043a);
    }

    public final int hashCode() {
        return this.f2043a.hashCode();
    }

    public final String toString() {
        return "MarketGroup(delegateAction=" + this.f2043a + Separators.RPAREN;
    }
}
