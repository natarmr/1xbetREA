package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nl2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yk2 f23707a;
    public final boolean b;
    public final boolean c;
    public final gds0 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final s4i0 h;
    public final s4i0 i;

    public nl2(yk2 yk2Var, boolean z, boolean z2, gds0 gds0Var, boolean z3, boolean z4, boolean z5, s4i0 s4i0Var, s4i0 s4i0Var2) {
        this.f23707a = yk2Var;
        this.b = z;
        this.c = z2;
        this.d = gds0Var;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = s4i0Var;
        this.i = s4i0Var2;
    }

    public static nl2 a(nl2 nl2Var, yk2 yk2Var, boolean z, boolean z2, gds0 gds0Var, boolean z3, boolean z4, boolean z5, s4i0 s4i0Var, s4i0 s4i0Var2, int i) {
        if ((i & 1) != 0) {
            yk2Var = nl2Var.f23707a;
        }
        yk2 yk2Var2 = yk2Var;
        if ((i & 2) != 0) {
            z = nl2Var.b;
        }
        boolean z6 = z;
        if ((i & 4) != 0) {
            z2 = nl2Var.c;
        }
        boolean z7 = z2;
        if ((i & 8) != 0) {
            gds0Var = nl2Var.d;
        }
        gds0 gds0Var2 = gds0Var;
        if ((i & 16) != 0) {
            z3 = nl2Var.e;
        }
        boolean z8 = z3;
        boolean z9 = (i & 32) != 0 ? nl2Var.f : z4;
        boolean z10 = (i & 64) != 0 ? nl2Var.g : z5;
        s4i0 s4i0Var3 = (i & 128) != 0 ? nl2Var.h : s4i0Var;
        s4i0 s4i0Var4 = (i & 256) != 0 ? nl2Var.i : s4i0Var2;
        nl2Var.getClass();
        return new nl2(yk2Var2, z6, z7, gds0Var2, z8, z9, z10, s4i0Var3, s4i0Var4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl2)) {
            return false;
        }
        nl2 nl2Var = (nl2) obj;
        return Intrinsics.d(this.f23707a, nl2Var.f23707a) && this.b == nl2Var.b && this.c == nl2Var.c && this.d.equals(nl2Var.d) && this.e == nl2Var.e && this.f == nl2Var.f && this.g == nl2Var.g && Intrinsics.d(this.h, nl2Var.h) && Intrinsics.d(this.i, nl2Var.i);
    }

    public final int hashCode() {
        yk2 yk2Var = this.f23707a;
        int iE = brm0.e(brm0.e(brm0.e((this.d.hashCode() + brm0.e(brm0.e((yk2Var == null ? 0 : yk2Var.hashCode()) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g);
        s4i0 s4i0Var = this.h;
        int iHashCode = (iE + (s4i0Var == null ? 0 : s4i0Var.hashCode())) * 31;
        s4i0 s4i0Var2 = this.i;
        return iHashCode + (s4i0Var2 != null ? s4i0Var2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AltSportTrackedState(config=");
        sb.append(this.f23707a);
        sb.append(", connected=");
        sb.append(this.b);
        sb.append(", canScrollUp=");
        sb.append(this.c);
        sb.append(", trackedModel=");
        sb.append(this.d);
        sb.append(", scrollToTop=");
        ua80.u(", refreshing=", ", recommendedGamesFirstRequest=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", selectedTrackCoefItem=");
        sb.append(this.h);
        sb.append(", removingTrackCoefItem=");
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
