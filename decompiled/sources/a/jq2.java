package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jq2 implements ms2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16929a;

    public jq2(long j) {
        this.f16929a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jq2) && this.f16929a == ((jq2) obj).f16929a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16929a);
    }

    public final String toString() {
        return axq.h(this.f16929a, "CyberChampScreen(champId=", Separators.RPAREN);
    }
}
