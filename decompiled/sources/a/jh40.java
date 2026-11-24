package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jh40 implements uh40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hdb f16511a;

    public final boolean equals(Object obj) {
        if (obj instanceof jh40) {
            return this.f16511a.equals(((jh40) obj).f16511a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16511a.hashCode();
    }

    public final String toString() {
        return "OnChampInfoAction(value=" + this.f16511a + Separators.RPAREN;
    }
}
