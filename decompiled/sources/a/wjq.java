package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wjq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39276a;

    public final boolean equals(Object obj) {
        if (obj instanceof wjq) {
            return this.f39276a == ((wjq) obj).f39276a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39276a);
    }

    public final String toString() {
        return ua80.e(this.f39276a, "FlashControlSelector(selector=", Separators.RPAREN);
    }
}
