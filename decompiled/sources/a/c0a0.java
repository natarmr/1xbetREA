package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class c0a0 implements d0a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3515a;

    public c0a0(int i) {
        this.f3515a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0a0) && this.f3515a == ((c0a0) obj).f3515a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3515a);
    }

    public final String toString() {
        return ua80.e(this.f3515a, "OnTabSelected(position=", Separators.RPAREN);
    }
}
