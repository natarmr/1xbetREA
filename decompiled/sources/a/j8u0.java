package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class j8u0 implements l8u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16105a;

    public j8u0(int i) {
        this.f16105a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j8u0) && this.f16105a == ((j8u0) obj).f16105a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16105a);
    }

    public final String toString() {
        return ua80.e(this.f16105a, "OnItemClick(id=", Separators.RPAREN);
    }
}
