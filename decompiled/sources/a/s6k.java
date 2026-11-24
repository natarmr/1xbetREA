package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class s6k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31707a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s6k) && this.f31707a == ((s6k) obj).f31707a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31707a);
    }

    public final String toString() {
        return ua80.e(this.f31707a, "DeltaCounter(count=", Separators.RPAREN);
    }
}
