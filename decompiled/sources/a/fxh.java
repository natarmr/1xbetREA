package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fxh implements ixh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10309a;

    public fxh(long j) {
        this.f10309a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fxh) && this.f10309a == ((fxh) obj).f10309a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10309a);
    }

    public final String toString() {
        return axq.h(this.f10309a, "OnChipClicked(index=", Separators.RPAREN);
    }
}
