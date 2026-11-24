package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zjn implements bkn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44489a;

    public final boolean equals(Object obj) {
        if (obj instanceof zjn) {
            return this.f44489a == ((zjn) obj).f44489a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f44489a);
    }

    public final String toString() {
        return axq.h(this.f44489a, "OnMoveButtonClick(gameId=", Separators.RPAREN);
    }
}
