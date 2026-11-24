package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ubr0 implements xbr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rbr0 f35395a;
    public final boolean b;
    public final nar0 c;
    public final nar0 d;

    public ubr0(rbr0 rbr0Var, boolean z, nar0 nar0Var, nar0 nar0Var2) {
        this.f35395a = rbr0Var;
        this.b = z;
        this.c = nar0Var;
        this.d = nar0Var2;
    }

    @Override // a.xbr0
    public final boolean a() {
        return this.b;
    }

    @Override // a.xbr0
    public final rbr0 b() {
        return this.f35395a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubr0)) {
            return false;
        }
        ubr0 ubr0Var = (ubr0) obj;
        return this.f35395a.equals(ubr0Var.f35395a) && this.b == ubr0Var.b && Intrinsics.d(this.c, ubr0Var.c) && Intrinsics.d(this.d, ubr0Var.d);
    }

    public final int hashCode() {
        int iE = brm0.e(this.f35395a.hashCode() * 31, 31, this.b);
        nar0 nar0Var = this.c;
        int iHashCode = (iE + (nar0Var == null ? 0 : nar0Var.hashCode())) * 31;
        nar0 nar0Var2 = this.d;
        return iHashCode + (nar0Var2 != null ? nar0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "Content(headerUiState=" + this.f35395a + ", rtlSupport=" + this.b + ", topRaiderUiModel=" + this.c + ", topTacklerUiModel=" + this.d + Separators.RPAREN;
    }
}
