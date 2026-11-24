package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nl0 implements pl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23705a;

    public nl0(int i) {
        this.f23705a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nl0) && this.f23705a == ((nl0) obj).f23705a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23705a);
    }

    public final String toString() {
        return ua80.e(this.f23705a, "OnTabSelect(tabIndex=", Separators.RPAREN);
    }
}
