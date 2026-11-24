package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ke50 implements oe50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m7h0 f18137a;

    public ke50(m7h0 m7h0Var) {
        m7h0Var.getClass();
        this.f18137a = m7h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ke50) && Intrinsics.d(this.f18137a, ((ke50) obj).f18137a);
    }

    public final int hashCode() {
        return this.f18137a.hashCode();
    }

    public final String toString() {
        return "Replace(screen=" + this.f18137a + Separators.RPAREN;
    }
}
