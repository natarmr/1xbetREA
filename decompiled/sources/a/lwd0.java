package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lwd0 implements owd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20760a;

    public final boolean equals(Object obj) {
        if (obj instanceof lwd0) {
            return this.f20760a == ((lwd0) obj).f20760a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20760a);
    }

    public final String toString() {
        return ua80.e(this.f20760a, "TabMapClick(value=", Separators.RPAREN);
    }
}
