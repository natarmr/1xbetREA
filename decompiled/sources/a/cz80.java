package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cz80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bz80 f5213a;
    public final py80 b;
    public final a4x c;

    public cz80(bz80 bz80Var, py80 py80Var, a4x a4xVar) {
        bz80Var.getClass();
        a4xVar.getClass();
        this.f5213a = bz80Var;
        this.b = py80Var;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz80)) {
            return false;
        }
        cz80 cz80Var = (cz80) obj;
        return Intrinsics.d(this.f5213a, cz80Var.f5213a) && this.b.equals(cz80Var.b) && this.c.equals(cz80Var.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + cs0.b(this.c, (this.b.hashCode() + (this.f5213a.f3454a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartnersTeamsUiState(toolbarUiModel=");
        sb.append(this.f5213a);
        sb.append(", contentState=");
        sb.append(this.b);
        sb.append(", itemList=");
        return cs0.n(sb, this.c, ", loading=false)");
    }
}
