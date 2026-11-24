package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class akn implements bkn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1029a;

    public final boolean equals(Object obj) {
        if (obj instanceof akn) {
            return this.f1029a == ((akn) obj).f1029a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1029a);
    }

    public final String toString() {
        return axq.h(this.f1029a, "OnOptionBetClick(gameId=", Separators.RPAREN);
    }
}
