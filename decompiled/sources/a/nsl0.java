package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nsl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f24056a;
    public final boolean b;
    public final a4x c;
    public final boolean d;
    public final mdm e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final mtl i;

    public nsl0(imm immVar, boolean z, a4x a4xVar, boolean z2, mdm mdmVar, boolean z3, boolean z4, boolean z5, mtl mtlVar) {
        a4xVar.getClass();
        this.f24056a = immVar;
        this.b = z;
        this.c = a4xVar;
        this.d = z2;
        this.e = mdmVar;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsl0)) {
            return false;
        }
        nsl0 nsl0Var = (nsl0) obj;
        return this.f24056a.equals(nsl0Var.f24056a) && this.b == nsl0Var.b && Intrinsics.d(this.c, nsl0Var.c) && this.d == nsl0Var.d && this.e.equals(nsl0Var.e) && this.f == nsl0Var.f && this.g == nsl0Var.g && this.h == nsl0Var.h && this.i.equals(nsl0Var.i);
    }

    public final int hashCode() {
        return this.i.f22376a.hashCode() + brm0.e(brm0.e(brm0.e(f140.d(this.e, brm0.e(cs0.b(this.c, brm0.e(this.f24056a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportsFilterUiState(navigationBarUiModel=");
        sb.append(this.f24056a);
        sb.append(", scrollToTop=");
        sb.append(this.b);
        sb.append(", uiSportItems=");
        sb.append(this.c);
        sb.append(", showError=");
        sb.append(this.d);
        sb.append(", lottieConfig=");
        sb.append(this.e);
        sb.append(", applyBtnEnabled=");
        sb.append(this.f);
        sb.append(", resetBtnEnabled=");
        ua80.u(", isDragEnabled=", ", bottomBarModel=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
