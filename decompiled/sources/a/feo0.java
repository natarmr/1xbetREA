package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class feo0 implements jeo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9416a;

    public feo0(int i) {
        this.f9416a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof feo0) && this.f9416a == ((feo0) obj).f9416a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9416a);
    }

    public final String toString() {
        return ua80.e(this.f9416a, "Launch(position=", Separators.RPAREN);
    }
}
