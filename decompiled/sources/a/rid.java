package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rid implements uid {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30537a;

    public rid(long j) {
        this.f30537a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rid) && this.f30537a == ((rid) obj).f30537a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f30537a);
    }

    public final String toString() {
        return axq.h(this.f30537a, "OnNotificationBtnClick(gameId=", Separators.RPAREN);
    }
}
