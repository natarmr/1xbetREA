package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class eqo implements hqo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8247a;

    public eqo(int i) {
        this.f8247a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eqo) && this.f8247a == ((eqo) obj).f8247a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8247a);
    }

    public final String toString() {
        return ua80.e(this.f8247a, "OnSegmentTabSwitched(position=", Separators.RPAREN);
    }
}
