package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xmm0 implements cnm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3i f41134a;

    public final boolean equals(Object obj) {
        if (obj instanceof xmm0) {
            return this.f41134a.equals(((xmm0) obj).f41134a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41134a.hashCode();
    }

    public final String toString() {
        return "LargeCardLargeSportIcon(model=" + this.f41134a + Separators.RPAREN;
    }
}
