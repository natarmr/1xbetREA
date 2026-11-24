package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ud50 implements oe50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m7h0 f35464a;

    public ud50(m7h0 m7h0Var) {
        this.f35464a = m7h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ud50) && Intrinsics.d(this.f35464a, ((ud50) obj).f35464a);
    }

    public final int hashCode() {
        m7h0 m7h0Var = this.f35464a;
        if (m7h0Var == null) {
            return 0;
        }
        return m7h0Var.hashCode();
    }

    public final String toString() {
        return "BackTo(screen=" + this.f35464a + Separators.RPAREN;
    }
}
