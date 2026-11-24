package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wx3 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39913a;

    public final boolean equals(Object obj) {
        if (obj instanceof wx3) {
            return this.f39913a == ((wx3) obj).f39913a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39913a);
    }

    public final String toString() {
        return ua80.e(this.f39913a, "ImageTintAttr(value=", Separators.RPAREN);
    }
}
