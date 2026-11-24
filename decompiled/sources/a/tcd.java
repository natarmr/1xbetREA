package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tcd implements vcd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33714a;

    public final boolean equals(Object obj) {
        if (obj instanceof tcd) {
            return this.f33714a == ((tcd) obj).f33714a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33714a);
    }

    public final String toString() {
        return ua80.e(this.f33714a, "Res(value=", Separators.RPAREN);
    }
}
