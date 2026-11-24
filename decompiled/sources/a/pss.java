package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pss implements qss {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f27528a;

    public final boolean equals(Object obj) {
        if (obj instanceof pss) {
            return this.f27528a.equals(((pss) obj).f27528a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27528a.hashCode();
    }

    public final String toString() {
        return "Statistic(itemsState=" + this.f27528a + Separators.RPAREN;
    }
}
