package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ck0 implements ik0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4483a;

    public ck0(long j) {
        this.f4483a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ck0) && this.f4483a == ((ck0) obj).f4483a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4483a);
    }

    public final String toString() {
        return axq.h(this.f4483a, "RecommendedGameClick(gameId=", Separators.RPAREN);
    }
}
