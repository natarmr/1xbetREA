package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kt7 implements rt7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18849a;

    public final boolean equals(Object obj) {
        if (obj instanceof kt7) {
            return this.f18849a == ((kt7) obj).f18849a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18849a);
    }

    public final String toString() {
        return ua80.e(this.f18849a, "OnLineUpClick(index=", Separators.RPAREN);
    }
}
