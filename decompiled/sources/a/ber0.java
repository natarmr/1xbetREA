package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ber0 implements eer0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dw60 f2465a;

    public ber0(dw60 dw60Var) {
        this.f2465a = dw60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ber0) && this.f2465a.equals(((ber0) obj).f2465a);
    }

    public final int hashCode() {
        return 1678354375;
    }

    public final String toString() {
        return "SendOneXGamesSideEffect(internalEffect=" + this.f2465a + Separators.RPAREN;
    }
}
