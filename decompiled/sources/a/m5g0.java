package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class m5g0 implements n5g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ill0 f21217a;

    public m5g0(ill0 ill0Var) {
        this.f21217a = ill0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5g0) && this.f21217a.equals(((m5g0) obj).f21217a);
    }

    public final int hashCode() {
        return this.f21217a.hashCode();
    }

    public final String toString() {
        return "ResultGameCard(delegateAction=" + this.f21217a + Separators.RPAREN;
    }
}
