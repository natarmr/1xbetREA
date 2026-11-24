package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class u7q0 implements w7q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35198a;

    public final boolean equals(Object obj) {
        if (obj instanceof u7q0) {
            return this.f35198a.equals(((u7q0) obj).f35198a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35198a.hashCode();
    }

    public final String toString() {
        return kng0.l("Error(value=", this.f35198a, Separators.RPAREN);
    }
}
