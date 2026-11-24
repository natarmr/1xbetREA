package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ei2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wh2 f7837a;
    public final boolean b;
    public final fqp0 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final List g;

    public ei2(wh2 wh2Var, boolean z, fqp0 fqp0Var, boolean z2, boolean z3, boolean z4, List list) {
        this.f7837a = wh2Var;
        this.b = z;
        this.c = fqp0Var;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = list;
    }

    public static ei2 a(ei2 ei2Var, wh2 wh2Var, boolean z, fqp0 fqp0Var, boolean z2, boolean z3, List list, int i) {
        if ((i & 1) != 0) {
            wh2Var = ei2Var.f7837a;
        }
        wh2 wh2Var2 = wh2Var;
        if ((i & 2) != 0) {
            z = ei2Var.b;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            fqp0Var = ei2Var.c;
        }
        fqp0 fqp0Var2 = fqp0Var;
        if ((i & 8) != 0) {
            z2 = ei2Var.d;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = ei2Var.e;
        }
        boolean z6 = z3;
        boolean z7 = (i & 32) != 0 ? ei2Var.f : false;
        if ((i & 64) != 0) {
            list = ei2Var.g;
        }
        ei2Var.getClass();
        return new ei2(wh2Var2, z4, fqp0Var2, z5, z6, z7, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei2)) {
            return false;
        }
        ei2 ei2Var = (ei2) obj;
        return Intrinsics.d(this.f7837a, ei2Var.f7837a) && this.b == ei2Var.b && this.c.equals(ei2Var.c) && this.d == ei2Var.d && this.e == ei2Var.e && this.f == ei2Var.f && Intrinsics.d(this.g, ei2Var.g);
    }

    public final int hashCode() {
        wh2 wh2Var = this.f7837a;
        int iE = brm0.e(brm0.e(brm0.e((this.c.hashCode() + brm0.e((wh2Var == null ? 0 : wh2Var.hashCode()) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f);
        List list = this.g;
        return iE + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AltSportTeamsState(config=");
        sb.append(this.f7837a);
        sb.append(", connected=");
        sb.append(this.b);
        sb.append(", teamsModel=");
        sb.append(this.c);
        sb.append(", scrollToTop=");
        sb.append(this.d);
        sb.append(", refreshing=");
        ua80.u(", favoriteTeamsFirstRequest=", ", cacheRecommendTeams=", sb, this.e, this.f);
        return dw9.r(sb, this.g, Separators.RPAREN);
    }
}
