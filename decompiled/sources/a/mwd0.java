package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mwd0 implements owd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22498a;

    public final boolean equals(Object obj) {
        if (obj instanceof mwd0) {
            return this.f22498a == ((mwd0) obj).f22498a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22498a);
    }

    public final String toString() {
        return axq.h(this.f22498a, "TeamClick(value=", Separators.RPAREN);
    }
}
