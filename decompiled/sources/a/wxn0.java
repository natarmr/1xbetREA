package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wxn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f39940a;
    public final a4x b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final imm i;
    public final ee j;
    public final rd k;
    public final String l;
    public final ksn0 m;

    public wxn0(a4x a4xVar, a4x a4xVar2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, imm immVar, ee eeVar, rd rdVar, String str, ksn0 ksn0Var) {
        a4xVar.getClass();
        a4xVar2.getClass();
        str.getClass();
        this.f39940a = a4xVar;
        this.b = a4xVar2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = immVar;
        this.j = eeVar;
        this.k = rdVar;
        this.l = str;
        this.m = ksn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxn0)) {
            return false;
        }
        wxn0 wxn0Var = (wxn0) obj;
        return Intrinsics.d(this.f39940a, wxn0Var.f39940a) && Intrinsics.d(this.b, wxn0Var.b) && this.c == wxn0Var.c && this.d == wxn0Var.d && this.e == wxn0Var.e && this.f == wxn0Var.f && this.g == wxn0Var.g && this.h == wxn0Var.h && this.i.equals(wxn0Var.i) && this.j.equals(wxn0Var.j) && this.k.equals(wxn0Var.k) && Intrinsics.d(this.l, wxn0Var.l) && this.m.equals(wxn0Var.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + ua80.b((this.k.hashCode() + ((this.j.hashCode() + h97.a(this.i, brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(cs0.b(this.b, this.f39940a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31)) * 31)) * 31, 31, this.l);
    }

    public final String toString() {
        StringBuilder sbQ = rw2.q("SwipexUiState(cardList=", this.f39940a, ", filters=", this.b, ", forceUpdate=");
        ua80.u(", loading=", ", filtersLoading=", sbQ, this.c, this.d);
        ua80.u(", showOnboarding=", ", showLottie=", sbQ, this.e, this.f);
        ua80.u(", allCardsSwiped=", ", navigationBarUiModel=", sbQ, this.g, this.h);
        sbQ.append(this.i);
        sbQ.append(", accountControlModel=");
        sbQ.append(this.j);
        sbQ.append(", accountColors=");
        sbQ.append(this.k);
        sbQ.append(", replenishPlaceHolder=");
        sbQ.append(this.l);
        sbQ.append(", betSetting=");
        sbQ.append(this.m);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
