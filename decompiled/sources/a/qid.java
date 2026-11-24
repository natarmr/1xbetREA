package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qid implements uid {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28786a;

    public qid(long j) {
        this.f28786a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qid) && this.f28786a == ((qid) obj).f28786a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28786a);
    }

    public final String toString() {
        return axq.h(this.f28786a, "OnMarketExpandClick(gameId=", Separators.RPAREN);
    }
}
