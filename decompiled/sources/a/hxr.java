package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hxr implements ixr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ywr f13824a;

    public final boolean equals(Object obj) {
        if (obj instanceof hxr) {
            return this.f13824a.equals(((hxr) obj).f13824a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13824a.hashCode();
    }

    public final String toString() {
        return "ThirdValue(statistic=" + this.f13824a + Separators.RPAREN;
    }
}
