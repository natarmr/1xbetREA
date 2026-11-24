package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class kxq0 implements wxq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ik0 f19069a;

    public kxq0(ik0 ik0Var) {
        this.f19069a = ik0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kxq0) && this.f19069a.equals(((kxq0) obj).f19069a);
    }

    public final int hashCode() {
        return this.f19069a.hashCode();
    }

    public final String toString() {
        return "Aggregator(delegateAction=" + this.f19069a + Separators.RPAREN;
    }
}
