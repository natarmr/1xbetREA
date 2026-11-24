package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class f3a0 implements g3a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8852a;

    public f3a0(int i) {
        this.f8852a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f3a0) && this.f8852a == ((f3a0) obj).f8852a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8852a);
    }

    public final String toString() {
        return ua80.e(this.f8852a, "OnSubTabSelected(position=", Separators.RPAREN);
    }
}
