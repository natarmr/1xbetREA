package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vtl implements xtl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f38012a;

    public vtl(c2 c2Var) {
        c2Var.getClass();
        this.f38012a = c2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vtl) && Intrinsics.d(this.f38012a, ((vtl) obj).f38012a);
    }

    public final int hashCode() {
        return this.f38012a.hashCode();
    }

    public final String toString() {
        return "DateWithTimeRange(state=" + this.f38012a + Separators.RPAREN;
    }
}
