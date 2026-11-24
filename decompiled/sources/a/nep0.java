package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nep0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23398a;
    public final a4x b;
    public final int c;

    public nep0(int i, a4x a4xVar, String str) {
        a4xVar.getClass();
        this.f23398a = str;
        this.b = a4xVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nep0)) {
            return false;
        }
        nep0 nep0Var = (nep0) obj;
        return this.f23398a.equals(nep0Var.f23398a) && Intrinsics.d(this.b, nep0Var.b) && this.c == nep0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cs0.b(this.b, this.f23398a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, kng0.u("TeamHeatMapUiModel(id=", this.f23398a, ", players=", this.b, ", arrowDrawable="));
    }
}
