package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kxa implements txa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19044a;

    public kxa(long j) {
        this.f19044a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kxa) && this.f19044a == ((kxa) obj).f19044a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19044a);
    }

    public final String toString() {
        return axq.h(this.f19044a, "OnGameClick(gameId=", Separators.RPAREN);
    }
}
