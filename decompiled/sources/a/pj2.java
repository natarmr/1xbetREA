package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej2 f27068a;
    public final boolean b;
    public final nj2 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final sff0 h;

    public pj2(ej2 ej2Var, boolean z, nj2 nj2Var, boolean z2, boolean z3, boolean z4, boolean z5, sff0 sff0Var) {
        this.f27068a = ej2Var;
        this.b = z;
        this.c = nj2Var;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = sff0Var;
    }

    public static pj2 a(pj2 pj2Var, ej2 ej2Var, boolean z, nj2 nj2Var, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            ej2Var = pj2Var.f27068a;
        }
        ej2 ej2Var2 = ej2Var;
        if ((i & 2) != 0) {
            z = pj2Var.b;
        }
        boolean z6 = z;
        if ((i & 4) != 0) {
            nj2Var = pj2Var.c;
        }
        nj2 nj2Var2 = nj2Var;
        if ((i & 8) != 0) {
            z2 = pj2Var.d;
        }
        boolean z7 = z2;
        if ((i & 16) != 0) {
            z3 = pj2Var.e;
        }
        boolean z8 = z3;
        if ((i & 32) != 0) {
            z4 = pj2Var.f;
        }
        boolean z9 = z4;
        boolean z10 = (i & 64) != 0 ? pj2Var.g : z5;
        sff0 sff0Var = pj2Var.h;
        pj2Var.getClass();
        return new pj2(ej2Var2, z6, nj2Var2, z7, z8, z9, z10, sff0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj2)) {
            return false;
        }
        pj2 pj2Var = (pj2) obj;
        return Intrinsics.d(this.f27068a, pj2Var.f27068a) && this.b == pj2Var.b && this.c.equals(pj2Var.c) && this.d == pj2Var.d && this.e == pj2Var.e && this.f == pj2Var.f && this.g == pj2Var.g && this.h.equals(pj2Var.h);
    }

    public final int hashCode() {
        ej2 ej2Var = this.f27068a;
        return this.h.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e((this.c.hashCode() + brm0.e((ej2Var == null ? 0 : ej2Var.hashCode()) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AltSportTournamentsState(config=");
        sb.append(this.f27068a);
        sb.append(", connected=");
        sb.append(this.b);
        sb.append(", altSportTournamentsModel=");
        sb.append(this.c);
        sb.append(", scrollToTop=");
        sb.append(this.d);
        sb.append(", refreshing=");
        ua80.u(", favoriteTournamentsFirstRequest=", ", recommendTournamentsFirstRequest=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", remoteConfig=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
