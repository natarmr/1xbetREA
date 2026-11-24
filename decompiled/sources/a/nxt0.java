package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nxt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24298a;

    public nxt0(int i) {
        this.f24298a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nxt0) && this.f24298a == ((nxt0) obj).f24298a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24298a);
    }

    public final String toString() {
        return ua80.e(this.f24298a, "ValorantCompletedCacheState(roundStatisticDrawCount=", Separators.RPAREN);
    }
}
