package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class yy20 implements az20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43448a;

    public final boolean equals(Object obj) {
        if (obj instanceof yy20) {
            return this.f43448a == ((yy20) obj).f43448a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f43448a);
    }

    public final String toString() {
        return axq.h(this.f43448a, "SubGameFilterSelect(subGameId=", Separators.RPAREN);
    }
}
