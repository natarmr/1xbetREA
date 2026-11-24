package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class svh implements uvh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32865a;

    public svh(long j) {
        this.f32865a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof svh) && this.f32865a == ((svh) obj).f32865a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32865a);
    }

    public final String toString() {
        return axq.h(this.f32865a, "OnChipClicked(index=", Separators.RPAREN);
    }
}
