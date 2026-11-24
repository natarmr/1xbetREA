package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class rt30 implements st30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jam0 f31060a;

    public final boolean equals(Object obj) {
        if (obj instanceof rt30) {
            return this.f31060a == ((rt30) obj).f31060a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31060a.hashCode();
    }

    public final String toString() {
        return "OnLottieClick(statisticBlockWidget=" + this.f31060a + Separators.RPAREN;
    }
}
