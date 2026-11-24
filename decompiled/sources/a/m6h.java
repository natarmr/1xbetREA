package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class m6h implements n6h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21270a;

    public m6h(long j) {
        this.f21270a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6h) && this.f21270a == ((m6h) obj).f21270a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21270a);
    }

    public final String toString() {
        return axq.h(this.f21270a, "OnSubGameSelected(subGameId=", Separators.RPAREN);
    }
}
