package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class rtr0 implements vtr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31090a;

    public rtr0(int i) {
        this.f31090a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rtr0) && this.f31090a == ((rtr0) obj).f31090a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31090a);
    }

    public final String toString() {
        return ua80.e(this.f31090a, "OnCheckBoxClick(position=", Separators.RPAREN);
    }
}
