package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t67 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33401a;

    public final boolean equals(Object obj) {
        if (obj instanceof t67) {
            return this.f33401a == ((t67) obj).f33401a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33401a);
    }

    public final String toString() {
        return ua80.e(this.f33401a, "ShowHideHistory(maxHidePeriod=", Separators.RPAREN);
    }
}
