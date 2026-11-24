package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class eu30 implements bv30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8399a;

    public final boolean equals(Object obj) {
        if (obj instanceof eu30) {
            return this.f8399a == ((eu30) obj).f8399a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8399a);
    }

    public final String toString() {
        return ua80.e(this.f8399a, "PreMatchTabClick(tabId=", Separators.RPAREN);
    }
}
