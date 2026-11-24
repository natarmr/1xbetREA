package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class f3j0 implements g3j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8867a;

    public final boolean equals(Object obj) {
        if (obj instanceof f3j0) {
            return this.f8867a.equals(((f3j0) obj).f8867a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8867a.hashCode();
    }

    public final String toString() {
        return kng0.l("DefaultBetSumValue(value=", this.f8867a, Separators.RPAREN);
    }
}
