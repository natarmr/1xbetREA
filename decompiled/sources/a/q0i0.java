package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class q0i0 implements r0i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f27900a;

    /* JADX WARN: Multi-variable type inference failed */
    public q0i0(int i) {
        this.f27900a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0i0) && this.f27900a == ((q0i0) obj).f27900a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27900a);
    }

    public final String toString() {
        return ua80.e(this.f27900a, "Single(id=", Separators.RPAREN);
    }
}
