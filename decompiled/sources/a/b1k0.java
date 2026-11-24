package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class b1k0 implements d1k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1810a;

    public b1k0(int i) {
        this.f1810a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1k0) && this.f1810a == ((b1k0) obj).f1810a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1810a);
    }

    public final String toString() {
        return ua80.e(this.f1810a, "ShowFavoriteError(message=", Separators.RPAREN);
    }
}
