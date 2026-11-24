package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zds0 implements w9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44223a;

    public zds0(long j) {
        this.f44223a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zds0) && this.f44223a == ((zds0) obj).f44223a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f44223a);
    }

    public final String toString() {
        return axq.h(this.f44223a, "TransactionDateModel(data=", Separators.RPAREN);
    }
}
