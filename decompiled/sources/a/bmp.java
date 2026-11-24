package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bmp implements smp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2846a;

    public bmp(long j) {
        this.f2846a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bmp) && this.f2846a == ((bmp) obj).f2846a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2846a);
    }

    public final String toString() {
        return axq.h(this.f2846a, "ItemClicked(selectedId=", Separators.RPAREN);
    }
}
