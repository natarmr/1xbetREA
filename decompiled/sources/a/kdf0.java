package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kdf0 implements ldf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18105a;

    public kdf0(long j) {
        this.f18105a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kdf0) && znq0.e(this.f18105a, ((kdf0) obj).f18105a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f18105a);
    }

    public final String toString() {
        return kng0.l("SearchLive(timerValue=", znq0.h(this.f18105a), Separators.RPAREN);
    }
}
