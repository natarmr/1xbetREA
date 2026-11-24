package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class h8p0 implements m8p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12639a;

    public h8p0(long j) {
        this.f12639a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8p0) && this.f12639a == ((h8p0) obj).f12639a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12639a);
    }

    public final String toString() {
        return axq.h(this.f12639a, "OnResultCardClick(gameId=", Separators.RPAREN);
    }
}
