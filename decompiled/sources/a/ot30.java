package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ot30 implements st30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jam0 f25813a;

    public final boolean equals(Object obj) {
        if (obj instanceof ot30) {
            return this.f25813a == ((ot30) obj).f25813a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25813a.hashCode();
    }

    public final String toString() {
        return "OnClickArrow(statisticBlockWidget=" + this.f25813a + Separators.RPAREN;
    }
}
