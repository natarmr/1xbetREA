package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class i5g0 implements n5g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14191a;

    public i5g0(int i) {
        this.f14191a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i5g0) && this.f14191a == ((i5g0) obj).f14191a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14191a);
    }

    public final String toString() {
        return ua80.e(this.f14191a, "OnDateFilterClick(index=", Separators.RPAREN);
    }
}
