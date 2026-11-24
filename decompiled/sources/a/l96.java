package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class l96 implements o96 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4i f19635a;

    public final boolean equals(Object obj) {
        if (obj instanceof l96) {
            return this.f19635a.equals(((l96) obj).f19635a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19635a.hashCode();
    }

    public final String toString() {
        return "LargeCardWatermark(model=" + this.f19635a + Separators.RPAREN;
    }
}
