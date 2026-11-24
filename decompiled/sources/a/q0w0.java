package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q0w0 implements g1w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m7h0 f27923a;

    public q0w0(m7h0 m7h0Var) {
        this.f27923a = m7h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0w0) && Intrinsics.d(this.f27923a, ((q0w0) obj).f27923a);
    }

    public final int hashCode() {
        m7h0 m7h0Var = this.f27923a;
        if (m7h0Var == null) {
            return 0;
        }
        return m7h0Var.hashCode();
    }

    public final String toString() {
        return "BackTo(screen=" + this.f27923a + Separators.RPAREN;
    }
}
