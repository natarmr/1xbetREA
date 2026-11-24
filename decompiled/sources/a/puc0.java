package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class puc0 implements suc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27609a;

    public puc0(long j) {
        this.f27609a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof puc0) && this.f27609a == ((puc0) obj).f27609a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f27609a);
    }

    public final String toString() {
        return axq.h(this.f27609a, "BonusGame(gameId=", Separators.RPAREN);
    }
}
