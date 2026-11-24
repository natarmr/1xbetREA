package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gkw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11464a;
    public final a4x b;
    public final ekw c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final dxh0 g;

    public gkw(boolean z, a4x a4xVar, ekw ekwVar, boolean z2, boolean z3, boolean z4, dxh0 dxh0Var) {
        a4xVar.getClass();
        ekwVar.getClass();
        this.f11464a = z;
        this.b = a4xVar;
        this.c = ekwVar;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = dxh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkw)) {
            return false;
        }
        gkw gkwVar = (gkw) obj;
        return this.f11464a == gkwVar.f11464a && Intrinsics.d(this.b, gkwVar.b) && Intrinsics.d(this.c, gkwVar.c) && this.d == gkwVar.d && this.e == gkwVar.e && this.f == gkwVar.f && this.g.equals(gkwVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + brm0.e(brm0.e(brm0.e((this.c.hashCode() + cs0.b(this.b, Boolean.hashCode(this.f11464a) * 31, 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeToolbarUiState(visible=");
        sb.append(this.f11464a);
        sb.append(", toolbarPages=");
        sb.append(this.b);
        sb.append(", selectedPage=");
        sb.append(this.c);
        sb.append(", stockVisible=");
        sb.append(this.d);
        sb.append(", stockWithFire=");
        ua80.u(", calendarVisible=", ", segmentedControlStyle=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
