package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class w900 implements aa00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38753a;

    public w900(long j) {
        this.f38753a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w900) && this.f38753a == ((w900) obj).f38753a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38753a);
    }

    public final String toString() {
        return axq.h(this.f38753a, "OnChipClick(chipIndex=", Separators.RPAREN);
    }
}
