package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qfg implements rfg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28631a;

    public qfg(long j) {
        this.f28631a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qfg) && this.f28631a == ((qfg) obj).f28631a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28631a);
    }

    public final String toString() {
        return axq.h(this.f28631a, "OnResultCardClick(gameId=", Separators.RPAREN);
    }
}
