package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ptl0 implements qtl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27571a;

    public final boolean equals(Object obj) {
        if (obj instanceof ptl0) {
            return this.f27571a == ((ptl0) obj).f27571a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27571a);
    }

    public final String toString() {
        return ua80.e(this.f27571a, "ImageTintAttr(value=", Separators.RPAREN);
    }
}
