package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jdd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16324a;

    public jdd0(long j) {
        this.f16324a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jdd0) && this.f16324a == ((jdd0) obj).f16324a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16324a);
    }

    public final String toString() {
        return axq.h(this.f16324a, "UfcChamp(id=", Separators.RPAREN);
    }
}
