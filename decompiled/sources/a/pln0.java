package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pln0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27193a;
    public final boolean b;
    public final boolean c;

    public pln0(String str, boolean z, boolean z2) {
        str.getClass();
        this.f27193a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pln0)) {
            return false;
        }
        pln0 pln0Var = (pln0) obj;
        return Intrinsics.d(this.f27193a, pln0Var.f27193a) && this.b == pln0Var.b && this.c == pln0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f27193a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(brm0.u("SupportingTextUiState(supportingText=", this.f27193a, ", isStaticText=", this.b, ", isVip="), this.c, Separators.RPAREN);
    }
}
