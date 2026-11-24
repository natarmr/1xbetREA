package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class d3q0 implements g3q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5416a;

    public d3q0(int i) {
        this.f5416a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d3q0) && this.f5416a == ((d3q0) obj).f5416a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5416a);
    }

    public final String toString() {
        return ua80.e(this.f5416a, "OnTabSelected(id=", Separators.RPAREN);
    }
}
