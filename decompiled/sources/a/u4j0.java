package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class u4j0 implements a5j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bm5 f35052a;

    public u4j0(bm5 bm5Var) {
        this.f35052a = bm5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4j0) && this.f35052a == ((u4j0) obj).f35052a;
    }

    public final int hashCode() {
        return this.f35052a.hashCode();
    }

    public final String toString() {
        return "InitializeContent(balanceScreenType=" + this.f35052a + Separators.RPAREN;
    }
}
