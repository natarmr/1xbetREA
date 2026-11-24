package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class szl implements tzl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f33074a;

    public szl(i4 i4Var) {
        i4Var.getClass();
        this.f33074a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof szl) && Intrinsics.d(this.f33074a, ((szl) obj).f33074a);
    }

    public final int hashCode() {
        return this.f33074a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f33074a, "SingleLine(marketList=", Separators.RPAREN);
    }
}
