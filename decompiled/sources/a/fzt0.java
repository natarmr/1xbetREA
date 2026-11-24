package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fzt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ljg f10427a;
    public final ueh b;
    public final ypl0 c;
    public final w0u0 d;
    public final qrh e;

    public fzt0(ljg ljgVar, ueh uehVar, ypl0 ypl0Var, w0u0 w0u0Var, qrh qrhVar) {
        ljgVar.getClass();
        uehVar.getClass();
        ypl0Var.getClass();
        w0u0Var.getClass();
        qrhVar.getClass();
        this.f10427a = ljgVar;
        this.b = uehVar;
        this.c = ypl0Var;
        this.d = w0u0Var;
        this.e = qrhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzt0)) {
            return false;
        }
        fzt0 fzt0Var = (fzt0) obj;
        return Intrinsics.d(this.f10427a, fzt0Var.f10427a) && Intrinsics.d(this.b, fzt0Var.b) && Intrinsics.d(this.c, fzt0Var.c) && Intrinsics.d(this.d, fzt0Var.d) && Intrinsics.d(this.e, fzt0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f10427a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ValorantPostGameModel(lastMatchesInfoModel=" + this.f10427a + ", stageTableModel=" + this.b + ", sportSimpleModel=" + this.c + ", statisticMatches=" + this.d + ", playersComposition=" + this.e + Separators.RPAREN;
    }
}
