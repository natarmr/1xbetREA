package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class s4i0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31607a;
    public final long b;

    public s4i0(long j, long j2) {
        this.f31607a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4i0)) {
            return false;
        }
        s4i0 s4i0Var = (s4i0) obj;
        return this.f31607a == s4i0Var.f31607a && this.b == s4i0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f31607a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f31607a, "SelectedTrackCoefItem(gameId=", ", betId="));
    }
}
