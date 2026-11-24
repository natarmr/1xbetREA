package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class d3a0 implements g3a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5394a;

    public d3a0(int i) {
        this.f5394a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d3a0) && this.f5394a == ((d3a0) obj).f5394a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5394a);
    }

    public final String toString() {
        return ua80.e(this.f5394a, "OnMainTabSelected(position=", Separators.RPAREN);
    }
}
