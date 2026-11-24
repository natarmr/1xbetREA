package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zt30 implements bv30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44937a;

    public final boolean equals(Object obj) {
        if (obj instanceof zt30) {
            return this.f44937a == ((zt30) obj).f44937a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44937a);
    }

    public final String toString() {
        return ua80.e(this.f44937a, "LineUpTabClick(tabId=", Separators.RPAREN);
    }
}
