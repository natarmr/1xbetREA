package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bxr implements ixr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ywr f3387a;

    public final boolean equals(Object obj) {
        if (obj instanceof bxr) {
            return this.f3387a.equals(((bxr) obj).f3387a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3387a.hashCode();
    }

    public final String toString() {
        return "FirstValue(statistic=" + this.f3387a + Separators.RPAREN;
    }
}
