package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class vq50 implements zq50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37840a;

    public vq50(int i) {
        this.f37840a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vq50) && this.f37840a == ((vq50) obj).f37840a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37840a);
    }

    public final String toString() {
        return ua80.e(this.f37840a, "OnChipSelect(chipIndex=", Separators.RPAREN);
    }
}
