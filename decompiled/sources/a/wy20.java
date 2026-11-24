package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class wy20 implements az20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39958a;

    public final boolean equals(Object obj) {
        if (obj instanceof wy20) {
            return this.f39958a == ((wy20) obj).f39958a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f39958a);
    }

    public final String toString() {
        return axq.h(this.f39958a, "SubGameClick(subGameId=", Separators.RPAREN);
    }
}
