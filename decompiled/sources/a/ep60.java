package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ep60 implements vp60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8172a;

    public ep60(long j) {
        this.f8172a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ep60) && this.f8172a == ((ep60) obj).f8172a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8172a);
    }

    public final String toString() {
        return axq.h(this.f8172a, "OnFavoriteClicked(gameId=", Separators.RPAREN);
    }
}
