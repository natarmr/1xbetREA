package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class s440 implements t440 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31588a;

    public s440(long j) {
        this.f31588a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s440) && this.f31588a == ((s440) obj).f31588a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31588a);
    }

    public final String toString() {
        return axq.h(this.f31588a, "StocksSection(actionId=", Separators.RPAREN);
    }
}
