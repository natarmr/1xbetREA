package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nlj0 implements olj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23731a;

    public nlj0(int i) {
        this.f23731a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nlj0) && this.f23731a == ((nlj0) obj).f23731a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23731a);
    }

    public final String toString() {
        return ua80.e(this.f23731a, "OnTabSelect(currentTab=", Separators.RPAREN);
    }
}
