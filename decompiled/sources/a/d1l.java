package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class d1l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5313a;

    public final boolean equals(Object obj) {
        if (obj instanceof d1l) {
            return this.f5313a == ((d1l) obj).f5313a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5313a);
    }

    public final String toString() {
        return ua80.e(this.f5313a, "ImageTintAttr(value=", Separators.RPAREN);
    }
}
