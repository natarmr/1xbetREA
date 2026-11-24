package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class o8i0 implements p8i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24830a;

    public o8i0(int i) {
        this.f24830a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o8i0) && this.f24830a == ((o8i0) obj).f24830a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24830a);
    }

    public final String toString() {
        return ua80.e(this.f24830a, "OnValueSelect(index=", Separators.RPAREN);
    }
}
