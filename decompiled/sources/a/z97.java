package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class z97 implements la7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44003a;

    public z97(long j) {
        this.f44003a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z97) && this.f44003a == ((z97) obj).f44003a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f44003a);
    }

    public final String toString() {
        return axq.h(this.f44003a, "OnItemClick(gameId=", Separators.RPAREN);
    }
}
