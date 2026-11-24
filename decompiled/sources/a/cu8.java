package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cu8 implements su8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4975a;

    public cu8(long j) {
        this.f4975a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cu8) && this.f4975a == ((cu8) obj).f4975a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4975a);
    }

    public final String toString() {
        return axq.h(this.f4975a, "OnChipClick(chipId=", Separators.RPAREN);
    }
}
