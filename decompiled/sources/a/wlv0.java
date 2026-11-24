package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wlv0 implements zlv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ydm0 f39376a;
    public final j9m0 b;
    public final llm0 c;
    public final boolean d;
    public final a4x e;

    public wlv0(ydm0 ydm0Var, j9m0 j9m0Var, llm0 llm0Var, boolean z, a4x a4xVar) {
        a4xVar.getClass();
        this.f39376a = ydm0Var;
        this.b = j9m0Var;
        this.c = llm0Var;
        this.d = z;
        this.e = a4xVar;
    }

    @Override // a.zlv0
    public final boolean a() {
        return this.d;
    }

    @Override // a.zlv0
    public final j9m0 b() {
        return this.b;
    }

    @Override // a.zlv0
    public final zdm0 c() {
        return this.f39376a;
    }

    @Override // a.zlv0
    public final llm0 d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlv0)) {
            return false;
        }
        wlv0 wlv0Var = (wlv0) obj;
        return this.f39376a.equals(wlv0Var.f39376a) && this.b.equals(wlv0Var.b) && this.c == wlv0Var.c && this.d == wlv0Var.d && Intrinsics.d(this.e, wlv0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e((this.c.hashCode() + w6x.h(this.b, this.f39376a.hashCode() * 31, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(statisticHeaderUiModel=");
        sb.append(this.f39376a);
        sb.append(", statisticBackgroundUiModel=");
        sb.append(this.b);
        sb.append(", screenStyle=");
        sb.append(this.c);
        sb.append(", rtlSupport=");
        sb.append(this.d);
        sb.append(", menuItemList=");
        return cs0.n(sb, this.e, Separators.RPAREN);
    }
}
