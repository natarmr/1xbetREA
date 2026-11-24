package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v6o0 implements w6o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36887a;

    public v6o0(long j) {
        this.f36887a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v6o0) && this.f36887a == ((v6o0) obj).f36887a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f36887a);
    }

    public final String toString() {
        return axq.h(this.f36887a, "OnResultCardClick(gameId=", Separators.RPAREN);
    }
}
