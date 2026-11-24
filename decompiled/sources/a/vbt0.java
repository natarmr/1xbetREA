package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vbt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gat0 f37156a;
    public final z8t0 b;
    public final mbt0 c;
    public final a4x d;
    public final boolean e;

    public vbt0(gat0 gat0Var, z8t0 z8t0Var, mbt0 mbt0Var, a4x a4xVar, boolean z) {
        gat0Var.getClass();
        z8t0Var.getClass();
        this.f37156a = gat0Var;
        this.b = z8t0Var;
        this.c = mbt0Var;
        this.d = a4xVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbt0)) {
            return false;
        }
        vbt0 vbt0Var = (vbt0) obj;
        return Intrinsics.d(this.f37156a, vbt0Var.f37156a) && Intrinsics.d(this.b, vbt0Var.b) && this.c.equals(vbt0Var.c) && this.d.equals(vbt0Var.d) && this.e == vbt0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cs0.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f37156a.f10987a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UniversalChampResultsUiState(navigationBarUiModel=");
        sb.append(this.f37156a);
        sb.append(", calendarUiModel=");
        sb.append(this.b);
        sb.append(", contentUiModel=");
        sb.append(this.c);
        sb.append(", uiItemList=");
        sb.append(this.d);
        sb.append(", loading=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
