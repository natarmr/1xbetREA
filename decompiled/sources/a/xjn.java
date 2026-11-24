package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xjn implements bkn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40994a;

    public final boolean equals(Object obj) {
        if (obj instanceof xjn) {
            return this.f40994a == ((xjn) obj).f40994a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40994a);
    }

    public final String toString() {
        return axq.h(this.f40994a, "OnCancelButtonClick(gameId=", Separators.RPAREN);
    }
}
