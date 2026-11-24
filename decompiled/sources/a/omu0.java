package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class omu0 implements qmu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f25521a;

    public final boolean equals(Object obj) {
        if (obj instanceof omu0) {
            return this.f25521a == ((omu0) obj).f25521a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25521a);
    }

    public final String toString() {
        return ua80.e(this.f25521a, "Limited(limit=", Separators.RPAREN);
    }
}
