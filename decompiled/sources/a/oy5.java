package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class oy5 extends zy5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26045a;

    public oy5(long j) {
        this.f26045a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oy5) && this.f26045a == ((oy5) obj).f26045a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26045a);
    }

    public final String toString() {
        return axq.h(this.f26045a, "GetGameBalance(accountId=", Separators.RPAREN);
    }
}
