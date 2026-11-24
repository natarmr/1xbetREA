package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lfd0 implements mfd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19950a;

    public lfd0(long j) {
        this.f19950a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lfd0) && this.f19950a == ((lfd0) obj).f19950a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19950a);
    }

    public final String toString() {
        return axq.h(this.f19950a, "Running(timeInSeconds=", Separators.RPAREN);
    }
}
