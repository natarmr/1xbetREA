package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class eli0 implements hli0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7999a;

    public eli0(int i) {
        this.f7999a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eli0) && this.f7999a == ((eli0) obj).f7999a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7999a);
    }

    public final String toString() {
        return ua80.e(this.f7999a, "OnLimitValueSelect(index=", Separators.RPAREN);
    }
}
