package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class v91 implements w91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37011a;

    public v91(long j) {
        this.f37011a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v91) && this.f37011a == ((v91) obj).f37011a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f37011a);
    }

    public final String toString() {
        return axq.h(this.f37011a, "ValidGameBalance(balanceId=", Separators.RPAREN);
    }
}
