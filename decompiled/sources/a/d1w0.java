package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d1w0 implements g1w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m7h0 f5332a;

    public d1w0(m7h0 m7h0Var) {
        m7h0Var.getClass();
        this.f5332a = m7h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1w0) && Intrinsics.d(this.f5332a, ((d1w0) obj).f5332a);
    }

    public final int hashCode() {
        return this.f5332a.hashCode();
    }

    public final String toString() {
        return "Replace(screen=" + this.f5332a + Separators.RPAREN;
    }
}
