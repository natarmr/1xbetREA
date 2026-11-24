package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cxr implements ixr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ywr f5136a;

    public final boolean equals(Object obj) {
        if (obj instanceof cxr) {
            return this.f5136a.equals(((cxr) obj).f5136a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5136a.hashCode();
    }

    public final String toString() {
        return "FourthValue(statistic=" + this.f5136a + Separators.RPAREN;
    }
}
