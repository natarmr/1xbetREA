package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class i7n implements j7n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y6q0 f14300a;

    public final boolean equals(Object obj) {
        if (obj instanceof i7n) {
            return this.f14300a.equals(((i7n) obj).f14300a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14300a.hashCode();
    }

    public final String toString() {
        return "TextFieldMultilineFilled(model=" + this.f14300a + Separators.RPAREN;
    }
}
