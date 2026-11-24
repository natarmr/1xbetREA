package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class b280 implements d280 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1842a;

    public /* synthetic */ b280(int i) {
        this.f1842a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b280) {
            return this.f1842a == ((b280) obj).f1842a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1842a);
    }

    public final String toString() {
        return ua80.e(this.f1842a, "HostGuest(icon=", Separators.RPAREN);
    }
}
