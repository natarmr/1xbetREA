package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class g3e0 implements h3e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10606a;

    public g3e0(int i) {
        this.f10606a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g3e0) && this.f10606a == ((g3e0) obj).f10606a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10606a);
    }

    public final String toString() {
        return ua80.e(this.f10606a, "OnSegmentClick(index=", Separators.RPAREN);
    }
}
