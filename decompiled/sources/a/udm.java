package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class udm implements bem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35486a;

    public udm(long j) {
        this.f35486a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof udm) && this.f35486a == ((udm) obj).f35486a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f35486a);
    }

    public final String toString() {
        return axq.h(this.f35486a, "OnMarketExpandBtnClicked(gameId=", Separators.RPAREN);
    }
}
