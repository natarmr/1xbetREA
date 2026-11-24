package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class qe10 implements se10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f28560a;

    public qe10(i4 i4Var) {
        i4Var.getClass();
        this.f28560a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qe10) && Intrinsics.d(this.f28560a, ((qe10) obj).f28560a);
    }

    public final int hashCode() {
        return this.f28560a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f28560a, "Content(items=", Separators.RPAREN);
    }
}
