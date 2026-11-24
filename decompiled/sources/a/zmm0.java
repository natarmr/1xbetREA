package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zmm0 implements cnm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3i f44632a;

    public final boolean equals(Object obj) {
        if (obj instanceof zmm0) {
            return this.f44632a.equals(((zmm0) obj).f44632a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44632a.hashCode();
    }

    public final String toString() {
        return "LargeCardWatermark(model=" + this.f44632a + Separators.RPAREN;
    }
}
