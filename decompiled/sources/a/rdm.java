package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class rdm implements bem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30297a;

    public rdm(long j) {
        this.f30297a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rdm) && this.f30297a == ((rdm) obj).f30297a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f30297a);
    }

    public final String toString() {
        return axq.h(this.f30297a, "OnAdditionalInfoExpandBtnClicked(gameId=", Separators.RPAREN);
    }
}
