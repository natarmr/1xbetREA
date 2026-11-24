package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class m3s0 implements o3s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21134a;

    public m3s0(int i) {
        this.f21134a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m3s0) && this.f21134a == ((m3s0) obj).f21134a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21134a);
    }

    public final String toString() {
        return ua80.e(this.f21134a, "OnSelectTab(index=", Separators.RPAREN);
    }
}
