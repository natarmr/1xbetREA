package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pt30 implements st30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jam0 f27545a;

    public final boolean equals(Object obj) {
        if (obj instanceof pt30) {
            return this.f27545a == ((pt30) obj).f27545a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27545a.hashCode();
    }

    public final String toString() {
        return "OnDetailClick(statisticBlockWidget=" + this.f27545a + Separators.RPAREN;
    }
}
