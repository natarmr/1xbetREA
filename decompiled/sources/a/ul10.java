package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ul10 implements vl10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35853a;

    public ul10(long j) {
        this.f35853a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ul10) && this.f35853a == ((ul10) obj).f35853a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f35853a);
    }

    public final String toString() {
        return axq.h(this.f35853a, "OnWildFreeBetGameSelect(gameId=", Separators.RPAREN);
    }
}
