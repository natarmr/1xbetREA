package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wwt0 implements lxt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hdb f39901a;

    public final boolean equals(Object obj) {
        if (obj instanceof wwt0) {
            return this.f39901a.equals(((wwt0) obj).f39901a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39901a.hashCode();
    }

    public final String toString() {
        return "OnChampInfoAction(value=" + this.f39901a + Separators.RPAREN;
    }
}
