package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vn0 implements xn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wdp f37692a;
    public final a4x b;
    public final boolean c;
    public final yk0 d;
    public final dxh0 e;
    public final on0 f;
    public final on0 g;
    public final imm h;

    /* JADX WARN: Multi-variable type inference failed */
    public vn0(wdp wdpVar, i4 i4Var, int i, yk0 yk0Var, dxh0 dxh0Var, on0 on0Var, on0 on0Var2, imm immVar) {
        i4Var.getClass();
        yk0Var.getClass();
        dxh0Var.getClass();
        on0Var.getClass();
        on0Var2.getClass();
        immVar.getClass();
        this.f37692a = wdpVar;
        this.b = i4Var;
        this.c = i;
        this.d = yk0Var;
        this.e = dxh0Var;
        this.f = on0Var;
        this.g = on0Var2;
        this.h = immVar;
    }

    @Override // a.xn0
    public final imm a() {
        return this.h;
    }

    @Override // a.xn0
    public final wdp b() {
        return this.f37692a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn0)) {
            return false;
        }
        vn0 vn0Var = (vn0) obj;
        return Intrinsics.d(this.f37692a, vn0Var.f37692a) && Intrinsics.d(this.b, vn0Var.b) && this.c == vn0Var.c && this.d == vn0Var.d && Intrinsics.d(this.e, vn0Var.e) && Intrinsics.d(this.f, vn0Var.f) && Intrinsics.d(this.g, vn0Var.g) && Intrinsics.d(this.h, vn0Var.h);
    }

    public final int hashCode() {
        wdp wdpVar = this.f37692a;
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + hne.h(this.e, (this.d.hashCode() + twn.a(this.c ? 1 : 0, cs0.b(this.b, (wdpVar == null ? 0 : wdpVar.hashCode()) * 31, 31), 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Content(accountSelectionUiState=" + this.f37692a + ", segmentedControlTabs=" + this.b + ", selectedTabIndex=" + (this.c ? 1 : 0) + ", selectedTab=" + this.d + ", segmentedControlStyle=" + this.e + ", favoritesContent=" + this.f + ", viewedContent=" + this.g + ", navigationBarUiModel=" + this.h + Separators.RPAREN;
    }
}
