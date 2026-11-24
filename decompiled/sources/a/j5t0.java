package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class j5t0 implements k5t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f15950a;

    public j5t0(mdm mdmVar) {
        this.f15950a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j5t0) && this.f15950a.equals(((j5t0) obj).f15950a);
    }

    public final int hashCode() {
        return this.f15950a.hashCode();
    }

    public final String toString() {
        return b1j.j("Loading(lottieConfig=", this.f15950a, Separators.RPAREN);
    }
}
