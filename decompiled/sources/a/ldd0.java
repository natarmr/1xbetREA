package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ldd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19846a;

    public ldd0(long j) {
        this.f19846a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ldd0) && this.f19846a == ((ldd0) obj).f19846a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19846a);
    }

    public final String toString() {
        return axq.h(this.f19846a, "UfcFighter(id=", Separators.RPAREN);
    }
}
