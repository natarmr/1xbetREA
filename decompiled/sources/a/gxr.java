package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gxr implements ixr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ywr f12091a;

    public final boolean equals(Object obj) {
        if (obj instanceof gxr) {
            return this.f12091a.equals(((gxr) obj).f12091a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12091a.hashCode();
    }

    public final String toString() {
        return "SecondValue(statistic=" + this.f12091a + Separators.RPAREN;
    }
}
