package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class aw50 extends dw50 {
    public final kr5 d;
    public final List e;
    public final boolean f;
    public final int g;
    public final rv50 h;
    public final String i;
    public final mtl j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw50(kr5 kr5Var, List list, boolean z, int i, rv50 rv50Var, String str, mtl mtlVar) {
        super(kr5Var.o, kr5Var.f, str);
        kr5Var.getClass();
        list.getClass();
        str.getClass();
        this.d = kr5Var;
        this.e = list;
        this.f = z;
        this.g = i;
        this.h = rv50Var;
        this.i = str;
        this.j = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw50)) {
            return false;
        }
        aw50 aw50Var = (aw50) obj;
        return Intrinsics.d(this.d, aw50Var.d) && Intrinsics.d(this.e, aw50Var.e) && this.f == aw50Var.f && this.g == aw50Var.g && this.h.equals(aw50Var.h) && Intrinsics.d(this.i, aw50Var.i) && this.j.equals(aw50Var.j);
    }

    public final int hashCode() {
        return this.j.f22376a.hashCode() + ua80.b((this.h.hashCode() + twn.a(this.g, brm0.e(dw9.a(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31)) * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(banner=");
        sb.append(this.d);
        sb.append(", tabs=");
        sb.append(this.e);
        sb.append(", bannerCollapsed=");
        ua80.q(this.g, ", currentTabIndex=", ", confirmDialogModel=", sb, this.f);
        sb.append(this.h);
        sb.append(", takingPart=");
        sb.append(this.i);
        sb.append(", bottomBarModel=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
