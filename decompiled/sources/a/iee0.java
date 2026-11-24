package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class iee0 implements pee0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14629a;

    public iee0(long j) {
        this.f14629a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iee0) && this.f14629a == ((iee0) obj).f14629a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14629a);
    }

    public final String toString() {
        return axq.h(this.f14629a, "OnGameClick(gameId=", Separators.RPAREN);
    }
}
