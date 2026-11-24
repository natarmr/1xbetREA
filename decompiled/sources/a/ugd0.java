package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ugd0 implements vgd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35620a;

    public ugd0(long j) {
        this.f35620a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ugd0) && this.f35620a == ((ugd0) obj).f35620a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f35620a);
    }

    public final String toString() {
        return axq.h(this.f35620a, "Running(timeSeconds=", Separators.RPAREN);
    }
}
