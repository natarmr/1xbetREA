package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class r9d0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30074a;

    public r9d0(int i) {
        this.f30074a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r9d0) && this.f30074a == ((r9d0) obj).f30074a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30074a);
    }

    public final String toString() {
        return ua80.e(this.f30074a, "Banner(bannerId=", Separators.RPAREN);
    }
}
