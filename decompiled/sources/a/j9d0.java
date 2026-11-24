package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class j9d0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lr1 f16132a;

    public j9d0(lr1 lr1Var) {
        this.f16132a = lr1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j9d0) && this.f16132a.equals(((j9d0) obj).f16132a);
    }

    public final int hashCode() {
        return this.f16132a.hashCode();
    }

    public final String toString() {
        return "Aggregator(tab=" + this.f16132a + Separators.RPAREN;
    }
}
