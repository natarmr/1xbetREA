package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nsu0 implements osu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24067a;

    public nsu0(long j) {
        this.f24067a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nsu0) && this.f24067a == ((nsu0) obj).f24067a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24067a);
    }

    public final String toString() {
        return axq.h(this.f24067a, "OnTabClick(tabId=", Separators.RPAREN);
    }
}
