package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class suh implements vuh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ydm0 f32819a;
    public final j9m0 b;
    public final llm0 c;
    public final boolean d;
    public final a4x e;

    public suh(ydm0 ydm0Var, j9m0 j9m0Var, llm0 llm0Var, boolean z, a4x a4xVar) {
        a4xVar.getClass();
        this.f32819a = ydm0Var;
        this.b = j9m0Var;
        this.c = llm0Var;
        this.d = z;
        this.e = a4xVar;
    }

    @Override // a.vuh
    public final boolean a() {
        return this.d;
    }

    @Override // a.vuh
    public final j9m0 b() {
        return this.b;
    }

    @Override // a.vuh
    public final zdm0 c() {
        return this.f32819a;
    }

    @Override // a.vuh
    public final llm0 d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof suh)) {
            return false;
        }
        suh suhVar = (suh) obj;
        return this.f32819a.equals(suhVar.f32819a) && this.b.equals(suhVar.b) && this.c == suhVar.c && this.d == suhVar.d && Intrinsics.d(this.e, suhVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e((this.c.hashCode() + w6x.h(this.b, this.f32819a.hashCode() * 31, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(statisticHeaderUiModel=");
        sb.append(this.f32819a);
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
