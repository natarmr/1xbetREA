package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class l4j0 implements n4j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19409a;

    public final boolean equals(Object obj) {
        if (obj instanceof l4j0) {
            return this.f19409a.equals(((l4j0) obj).f19409a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19409a.hashCode();
    }

    public final String toString() {
        return kng0.l("SecondValue(value=", this.f19409a, Separators.RPAREN);
    }
}
