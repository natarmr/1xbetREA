package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class oss implements qss {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f25796a;

    public final boolean equals(Object obj) {
        if (obj instanceof oss) {
            return this.f25796a.equals(((oss) obj).f25796a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25796a.hashCode();
    }

    public final String toString() {
        return b1j.j("NotFound(lottieConfig=", this.f25796a, Separators.RPAREN);
    }
}
