package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uw7 implements cx7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36380a;

    public uw7(long j) {
        this.f36380a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uw7) && this.f36380a == ((uw7) obj).f36380a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f36380a);
    }

    public final String toString() {
        return axq.h(this.f36380a, "AllMarketsHidden(hiddenMarketsCount=", Separators.RPAREN);
    }
}
