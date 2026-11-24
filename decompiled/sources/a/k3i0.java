package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class k3i0 implements l3i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17620a;

    public k3i0(long j) {
        this.f17620a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k3i0) && this.f17620a == ((k3i0) obj).f17620a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17620a);
    }

    public final String toString() {
        return axq.h(this.f17620a, "ShowSelectStartDateDialog(startTime=", Separators.RPAREN);
    }
}
