package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class fe50 implements oe50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m7h0 f9389a;

    public fe50(m7h0 m7h0Var) {
        m7h0Var.getClass();
        this.f9389a = m7h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fe50) && Intrinsics.d(this.f9389a, ((fe50) obj).f9389a);
    }

    public final int hashCode() {
        return this.f9389a.hashCode();
    }

    public final String toString() {
        return "Forward(screen=" + this.f9389a + Separators.RPAREN;
    }
}
