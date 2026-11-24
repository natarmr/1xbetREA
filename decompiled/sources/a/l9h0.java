package a;

import android.gov.nist.core.Separators;
import org.xplatform.ui_core.resources.UiText;

/* JADX INFO: loaded from: classes3.dex */
public final class l9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19652a;
    public final boolean b;
    public final boolean c;
    public final s77 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final UiText k;
    public final psd l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    public l9h0(boolean z, boolean z2, boolean z3, s77 s77Var, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str, UiText uiText, psd psdVar, boolean z9, boolean z10, boolean z11) {
        s77Var.getClass();
        this.f19652a = z;
        this.b = z2;
        this.c = z3;
        this.d = s77Var;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = str;
        this.k = uiText;
        this.l = psdVar;
        this.m = z9;
        this.n = z10;
        this.o = z11;
    }

    public static l9h0 a(l9h0 l9h0Var, boolean z, boolean z2, boolean z3, s77 s77Var, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, UiText.ByRes byRes, psd psdVar, boolean z9, boolean z10, int i) {
        boolean z11 = (i & 1) != 0 ? l9h0Var.f19652a : z;
        boolean z12 = (i & 2) != 0 ? l9h0Var.b : z2;
        boolean z13 = (i & 4) != 0 ? l9h0Var.c : z3;
        s77 s77Var2 = (i & 8) != 0 ? l9h0Var.d : s77Var;
        boolean z14 = (i & 16) != 0 ? l9h0Var.e : z4;
        boolean z15 = (i & 32) != 0 ? l9h0Var.f : z5;
        boolean z16 = (i & 64) != 0 ? l9h0Var.g : z6;
        boolean z17 = (i & 128) != 0 ? l9h0Var.h : z7;
        boolean z18 = (i & 256) != 0 ? l9h0Var.i : z8;
        String str = l9h0Var.j;
        UiText uiText = (i & 1024) != 0 ? l9h0Var.k : byRes;
        psd psdVar2 = (i & 2048) != 0 ? l9h0Var.l : psdVar;
        boolean z19 = (i & 4096) != 0 ? l9h0Var.m : z9;
        boolean z20 = l9h0Var.n;
        boolean z21 = (i & 16384) != 0 ? l9h0Var.o : z10;
        l9h0Var.getClass();
        s77Var2.getClass();
        return new l9h0(z11, z12, z13, s77Var2, z14, z15, z16, z17, z18, str, uiText, psdVar2, z19, z20, z21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9h0)) {
            return false;
        }
        l9h0 l9h0Var = (l9h0) obj;
        return this.f19652a == l9h0Var.f19652a && this.b == l9h0Var.b && this.c == l9h0Var.c && this.d == l9h0Var.d && this.e == l9h0Var.e && this.f == l9h0Var.f && this.g == l9h0Var.g && this.h == l9h0Var.h && this.i == l9h0Var.i && this.j.equals(l9h0Var.j) && this.k.equals(l9h0Var.k) && this.l.equals(l9h0Var.l) && this.m == l9h0Var.m && this.n == l9h0Var.n && this.o == l9h0Var.o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + brm0.e(brm0.e((this.l.hashCode() + ((this.k.hashCode() + ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((this.d.hashCode() + brm0.e(brm0.e(Boolean.hashCode(this.f19652a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31)) * 31, 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("ScreenUiState(loading=", ", refreshing=", ", enabledToolbarClicks=", this.f19652a, this.b);
        sbQ.append(this.c);
        sbQ.append(", currentType=");
        sbQ.append(this.d);
        sbQ.append(", showFullSale=");
        ua80.u(", compact=", ", typeArrowVisibility=", sbQ, this.e, this.f);
        ua80.u(", configureNeedAuth=", ", filterAppearance=", sbQ, this.g, this.h);
        f140.s(", totoName=", this.j, ", dateFilterName=", sbQ, this.i);
        sbQ.append(this.k);
        sbQ.append(", config=");
        sbQ.append(this.l);
        sbQ.append(", isConnected=");
        ua80.u(", hasCustomFilter=", ", enableRefresh=", sbQ, this.m, this.n);
        return rw2.p(sbQ, this.o, Separators.RPAREN);
    }
}
