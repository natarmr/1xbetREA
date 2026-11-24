package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cdn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4169a;
    public final List b;
    public final l9s c;
    public final long d;
    public final boolean e;
    public final xfa0 f;
    public final aw20 g;
    public final boolean h;

    public cdn(List list, List list2, l9s l9sVar, long j, boolean z, xfa0 xfa0Var, aw20 aw20Var, boolean z2) {
        list.getClass();
        list2.getClass();
        this.f4169a = list;
        this.b = list2;
        this.c = l9sVar;
        this.d = j;
        this.e = z;
        this.f = xfa0Var;
        this.g = aw20Var;
        this.h = z2;
    }

    public static cdn a(cdn cdnVar, List list, List list2, l9s l9sVar, boolean z, xfa0 xfa0Var, aw20 aw20Var, int i) {
        if ((i & 1) != 0) {
            list = cdnVar.f4169a;
        }
        List list3 = list;
        if ((i & 2) != 0) {
            list2 = cdnVar.b;
        }
        List list4 = list2;
        if ((i & 4) != 0) {
            l9sVar = cdnVar.c;
        }
        l9s l9sVar2 = l9sVar;
        long j = cdnVar.d;
        if ((i & 16) != 0) {
            z = cdnVar.e;
        }
        boolean z2 = z;
        xfa0 xfa0Var2 = (i & 32) != 0 ? cdnVar.f : xfa0Var;
        aw20 aw20Var2 = (i & 64) != 0 ? cdnVar.g : aw20Var;
        boolean z3 = cdnVar.h;
        cdnVar.getClass();
        list3.getClass();
        list4.getClass();
        aw20Var2.getClass();
        return new cdn(list3, list4, l9sVar2, j, z2, xfa0Var2, aw20Var2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdn)) {
            return false;
        }
        cdn cdnVar = (cdn) obj;
        return Intrinsics.d(this.f4169a, cdnVar.f4169a) && Intrinsics.d(this.b, cdnVar.b) && Intrinsics.d(this.c, cdnVar.c) && this.d == cdnVar.d && this.e == cdnVar.e && Intrinsics.d(this.f, cdnVar.f) && this.g.equals(cdnVar.g) && this.h == cdnVar.h;
    }

    public final int hashCode() {
        int iA = dw9.a(this.f4169a.hashCode() * 31, 31, this.b);
        l9s l9sVar = this.c;
        int iE = brm0.e(rw2.b((iA + (l9sVar == null ? 0 : l9sVar.hashCode())) * 31, 31, this.d), 31, this.e);
        xfa0 xfa0Var = this.f;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((iE + (xfa0Var != null ? xfa0Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("DuelMarketsStateModel(totalExactSelectedModels=", ", markets=", this.f4169a, ", gameDetailsModel=", this.b);
        sbT.append(this.c);
        sbT.append(", subGameId=");
        sbT.append(this.d);
        sbT.append(", isLoading=");
        sbT.append(this.e);
        sbT.append(", playersDuelModel=");
        sbT.append(this.f);
        sbT.append(", marketPropertiesModel=");
        sbT.append(this.g);
        sbT.append(", rtlSupport=");
        sbT.append(this.h);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
