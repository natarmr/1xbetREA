package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class j8t0 implements u8t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16103a;

    public j8t0(int i) {
        this.f16103a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j8t0) && this.f16103a == ((j8t0) obj).f16103a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16103a);
    }

    public final String toString() {
        return ua80.e(this.f16103a, "OnDateFilterClick(index=", Separators.RPAREN);
    }
}
