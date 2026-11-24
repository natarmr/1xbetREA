package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class s01 implements b11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31389a;

    public s01(long j) {
        this.f31389a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s01) && this.f31389a == ((s01) obj).f31389a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31389a);
    }

    public final String toString() {
        return axq.h(this.f31389a, "OnChipClick(chipId=", Separators.RPAREN);
    }
}
