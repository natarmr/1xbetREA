package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xh8 implements ci8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40876a;

    public xh8(long j) {
        this.f40876a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xh8) && this.f40876a == ((xh8) obj).f40876a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40876a);
    }

    public final String toString() {
        return axq.h(this.f40876a, "OnFilterClick(chipId=", Separators.RPAREN);
    }
}
