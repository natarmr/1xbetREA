package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class s4t implements x4t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f31624a;

    /* JADX WARN: Multi-variable type inference failed */
    public s4t(int i) {
        this.f31624a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s4t) && this.f31624a == ((s4t) obj).f31624a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31624a);
    }

    public final String toString() {
        return ua80.e(this.f31624a, "LastPlayed(limit=", Separators.RPAREN);
    }
}
