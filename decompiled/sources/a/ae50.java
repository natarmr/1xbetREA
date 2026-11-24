package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ae50 implements oe50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1w0 f711a;

    public ae50(g1w0 g1w0Var) {
        g1w0Var.getClass();
        this.f711a = g1w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ae50) && Intrinsics.d(this.f711a, ((ae50) obj).f711a);
    }

    public final int hashCode() {
        return this.f711a.hashCode();
    }

    public final String toString() {
        return "Dispatch(command=" + this.f711a + Separators.RPAREN;
    }
}
