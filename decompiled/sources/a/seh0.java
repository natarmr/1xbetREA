package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class seh0 implements xeh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32076a;

    public final boolean equals(Object obj) {
        if (obj instanceof seh0) {
            return this.f32076a == ((seh0) obj).f32076a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32076a);
    }

    public final String toString() {
        return axq.h(this.f32076a, "FilterClick(filterId=", Separators.RPAREN);
    }
}
