package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jn6 implements qn6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16798a;

    public jn6(long j) {
        this.f16798a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jn6) && this.f16798a == ((jn6) obj).f16798a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16798a);
    }

    public final String toString() {
        return axq.h(this.f16798a, "OnBetHeaderClick(groupId=", Separators.RPAREN);
    }
}
