package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mha0 implements nha0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21781a;

    public mha0(int i) {
        this.f21781a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mha0) && this.f21781a == ((mha0) obj).f21781a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21781a);
    }

    public final String toString() {
        return ua80.e(this.f21781a, "OnUpdateTabPosition(position=", Separators.RPAREN);
    }
}
