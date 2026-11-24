package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l7m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g7m f19566a;
    public final q7m b;
    public final a4x c;
    public final a4x d;
    public final a4x e;

    public l7m(g7m g7mVar, q7m q7mVar, i4 i4Var, i4 i4Var2, i4 i4Var3) {
        i4Var.getClass();
        i4Var2.getClass();
        i4Var3.getClass();
        this.f19566a = g7mVar;
        this.b = q7mVar;
        this.c = i4Var;
        this.d = i4Var2;
        this.e = i4Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7m)) {
            return false;
        }
        l7m l7mVar = (l7m) obj;
        return this.f19566a.equals(l7mVar.f19566a) && this.b.equals(l7mVar.b) && Intrinsics.d(this.c, l7mVar.c) && Intrinsics.d(this.d, l7mVar.d) && Intrinsics.d(this.e, l7mVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cs0.b(this.d, cs0.b(this.c, ua80.b(this.f19566a.hashCode() * 31, 31, this.b.f28257a), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsCyberGameTableUiModel(header=");
        sb.append(this.f19566a);
        sb.append(", mainColumnTitle=");
        sb.append(this.b);
        sb.append(", mainColumn=");
        hne.y(sb, this.c, ", dataColumns=", this.d, ", titleColumns=");
        return cs0.n(sb, this.e, Separators.RPAREN);
    }
}
