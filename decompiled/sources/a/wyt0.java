package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wyt0 implements zyt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39989a;

    public final boolean equals(Object obj) {
        if (obj instanceof wyt0) {
            return this.f39989a == ((wyt0) obj).f39989a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f39989a);
    }

    public final String toString() {
        return axq.h(this.f39989a, "TeamClick(value=", Separators.RPAREN);
    }
}
