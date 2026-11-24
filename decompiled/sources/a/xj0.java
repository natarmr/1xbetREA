package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xj0 implements ik0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40972a;

    public xj0(int i) {
        this.f40972a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xj0) && this.f40972a == ((xj0) obj).f40972a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40972a);
    }

    public final String toString() {
        return ua80.e(this.f40972a, "CategoryClick(bannerId=", Separators.RPAREN);
    }
}
