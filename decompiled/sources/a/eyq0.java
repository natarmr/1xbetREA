package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class eyq0 implements f0r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2r0 f8640a;
    public final j1r0 b;
    public final cic0 c;

    public eyq0(f2r0 f2r0Var, j1r0 j1r0Var, cic0 cic0Var) {
        this.f8640a = f2r0Var;
        this.b = j1r0Var;
        this.c = cic0Var;
    }

    public static eyq0 b(eyq0 eyq0Var, j1r0 j1r0Var, cic0 cic0Var, int i) {
        f2r0 f2r0Var = eyq0Var.f8640a;
        if ((i & 4) != 0) {
            cic0Var = eyq0Var.c;
        }
        j1r0Var.getClass();
        return new eyq0(f2r0Var, j1r0Var, cic0Var);
    }

    @Override // a.f0r0
    public final j1r0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyq0)) {
            return false;
        }
        eyq0 eyq0Var = (eyq0) obj;
        return this.f8640a.equals(eyq0Var.f8640a) && this.b.equals(eyq0Var.b) && Intrinsics.d(this.c, eyq0Var.c);
    }

    public final int hashCode() {
        int iH = brm0.h(this.b, this.f8640a.hashCode() * 31, 31);
        cic0 cic0Var = this.c;
        return iH + (cic0Var == null ? 0 : cic0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbS = brm0.s("TopAggregatorPromoGamesState(contentType=", this.f8640a, ", contentStatus=", this.b, ", content=");
        sbS.append(this.c);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
