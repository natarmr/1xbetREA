package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ln50 implements on50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20328a;

    public ln50(int i) {
        this.f20328a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ln50) && this.f20328a == ((ln50) obj).f20328a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20328a);
    }

    public final String toString() {
        return ua80.e(this.f20328a, "OnTabSelected(id=", Separators.RPAREN);
    }
}
