package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ky20 implements ny20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kv20 f19086a;

    public ky20(kv20 kv20Var) {
        this.f19086a = kv20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ky20) && this.f19086a.equals(((ky20) obj).f19086a);
    }

    public final int hashCode() {
        return this.f19086a.hashCode();
    }

    public final String toString() {
        return "MarketGroup(delegateAction=" + this.f19086a + Separators.RPAREN;
    }
}
