package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ak0 implements ik0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1002a;

    public ak0(long j) {
        this.f1002a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ak0) && this.f1002a == ((ak0) obj).f1002a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1002a);
    }

    public final String toString() {
        return axq.h(this.f1002a, "PromoGameClick(gameId=", Separators.RPAREN);
    }
}
