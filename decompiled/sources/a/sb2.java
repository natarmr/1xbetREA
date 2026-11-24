package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class sb2 implements tb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31910a;

    public final boolean equals(Object obj) {
        if (obj instanceof sb2) {
            return this.f31910a == ((sb2) obj).f31910a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31910a);
    }

    public final String toString() {
        return axq.h(this.f31910a, "OnSelectSport(value=", Separators.RPAREN);
    }
}
