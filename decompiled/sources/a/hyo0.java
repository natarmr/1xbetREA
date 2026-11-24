package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hyo0 implements iyo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13868a;

    public hyo0(int i) {
        this.f13868a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hyo0) && this.f13868a == ((hyo0) obj).f13868a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13868a);
    }

    public final String toString() {
        return ua80.e(this.f13868a, "OnTabSelected(tab=", Separators.RPAREN);
    }
}
