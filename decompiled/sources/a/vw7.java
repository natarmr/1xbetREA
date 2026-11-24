package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vw7 implements dx7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38135a;

    public vw7(long j) {
        this.f38135a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vw7) && this.f38135a == ((vw7) obj).f38135a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38135a);
    }

    public final String toString() {
        return axq.h(this.f38135a, "AllMarketsHidden(hiddenMarketsCount=", Separators.RPAREN);
    }
}
