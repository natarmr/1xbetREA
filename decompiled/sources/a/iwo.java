package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class iwo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15500a;
    public final long b;

    public iwo(long j, long j2) {
        this.f15500a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwo)) {
            return false;
        }
        iwo iwoVar = (iwo) obj;
        return ne60.c(this.f15500a, iwoVar.f15500a) && ne60.c(this.b, iwoVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f15500a) * 31);
    }

    public final String toString() {
        return b1j.k("FadeOffset(start=", ne60.h(this.f15500a), ", end=", ne60.h(this.b), Separators.RPAREN);
    }
}
