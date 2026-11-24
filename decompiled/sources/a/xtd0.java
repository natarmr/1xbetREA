package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xtd0 implements mud0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hdb f41461a;

    public final boolean equals(Object obj) {
        if (obj instanceof xtd0) {
            return this.f41461a.equals(((xtd0) obj).f41461a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41461a.hashCode();
    }

    public final String toString() {
        return "OnChampInfoAction(value=" + this.f41461a + Separators.RPAREN;
    }
}
