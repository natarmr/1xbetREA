package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tng0 extends ung0 {
    public final a4x c;
    public final xkg0 d;
    public final mtl e;
    public final String f;
    public final boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tng0(a4x a4xVar, xkg0 xkg0Var, mtl mtlVar, String str, boolean z) {
        super(str, z);
        a4xVar.getClass();
        str.getClass();
        this.c = a4xVar;
        this.d = xkg0Var;
        this.e = mtlVar;
        this.f = str;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tng0)) {
            return false;
        }
        tng0 tng0Var = (tng0) obj;
        return Intrinsics.d(this.c, tng0Var.c) && Intrinsics.d(this.d, tng0Var.d) && Intrinsics.d(this.e, tng0Var.e) && Intrinsics.d(this.f, tng0Var.f) && this.g == tng0Var.g;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        xkg0 xkg0Var = this.d;
        int iHashCode2 = (iHashCode + (xkg0Var == null ? 0 : xkg0Var.hashCode())) * 31;
        mtl mtlVar = this.e;
        return Boolean.hashCode(this.g) + ua80.b((iHashCode2 + (mtlVar != null ? mtlVar.f22376a.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RulesContent(rules=");
        sb.append(this.c);
        sb.append(", ruleButtonConfig=");
        sb.append(this.d);
        sb.append(", bottomBarModel=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", show=");
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
