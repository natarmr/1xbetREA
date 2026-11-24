package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rud0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31122a;

    public rud0(int i) {
        this.f31122a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rud0) && this.f31122a == ((rud0) obj).f31122a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31122a);
    }

    public final String toString() {
        return ua80.e(this.f31122a, "RainbowCompletedCacheState(statisticRoundsDrawCount=", Separators.RPAREN);
    }
}
