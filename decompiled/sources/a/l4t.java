package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class l4t implements x4t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f19425a;

    /* JADX WARN: Multi-variable type inference failed */
    public l4t(int i) {
        this.f19425a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l4t) && this.f19425a == ((l4t) obj).f19425a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19425a);
    }

    public final String toString() {
        return ua80.e(this.f19425a, "AggregatorSlots(limit=", Separators.RPAREN);
    }
}
