package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class omp implements smp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25514a;

    public omp(long j) {
        this.f25514a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof omp) && this.f25514a == ((omp) obj).f25514a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25514a);
    }

    public final String toString() {
        return axq.h(this.f25514a, "SelectionChanged(champId=", Separators.RPAREN);
    }
}
