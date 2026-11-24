package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pi6 implements qi6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kv20 f27028a;

    public pi6(kv20 kv20Var) {
        this.f27028a = kv20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pi6) && this.f27028a.equals(((pi6) obj).f27028a);
    }

    public final int hashCode() {
        return this.f27028a.hashCode();
    }

    public final String toString() {
        return "MarketGroup(delegateAction=" + this.f27028a + Separators.RPAREN;
    }
}
