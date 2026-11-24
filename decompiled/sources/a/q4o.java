package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q4o implements s4o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28108a;

    public q4o(long j) {
        this.f28108a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q4o) && this.f28108a == ((q4o) obj).f28108a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28108a);
    }

    public final String toString() {
        return axq.h(this.f28108a, "OnTabClick(tabId=", Separators.RPAREN);
    }
}
