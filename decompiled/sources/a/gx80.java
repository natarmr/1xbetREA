package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gx80 implements ix80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12066a;

    public final boolean equals(Object obj) {
        if (obj instanceof gx80) {
            return this.f12066a == ((gx80) obj).f12066a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12066a);
    }

    public final String toString() {
        return ua80.e(this.f12066a, "Res(value=", Separators.RPAREN);
    }
}
