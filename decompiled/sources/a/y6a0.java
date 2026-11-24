package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y6a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l730 f42088a;
    public final List b;
    public final String c;
    public final aw20 d;
    public final l9s e;
    public final boolean f;

    public y6a0(l730 l730Var, List list, String str, aw20 aw20Var, l9s l9sVar, boolean z) {
        list.getClass();
        this.f42088a = l730Var;
        this.b = list;
        this.c = str;
        this.d = aw20Var;
        this.e = l9sVar;
        this.f = z;
    }

    public static y6a0 a(y6a0 y6a0Var, l730 l730Var, List list, String str, aw20 aw20Var, l9s l9sVar, int i) {
        if ((i & 1) != 0) {
            l730Var = y6a0Var.f42088a;
        }
        l730 l730Var2 = l730Var;
        if ((i & 2) != 0) {
            list = y6a0Var.b;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str = y6a0Var.c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            aw20Var = y6a0Var.d;
        }
        aw20 aw20Var2 = aw20Var;
        if ((i & 16) != 0) {
            l9sVar = y6a0Var.e;
        }
        boolean z = y6a0Var.f;
        y6a0Var.getClass();
        l730Var2.getClass();
        list2.getClass();
        aw20Var2.getClass();
        return new y6a0(l730Var2, list2, str2, aw20Var2, l9sVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6a0)) {
            return false;
        }
        y6a0 y6a0Var = (y6a0) obj;
        return this.f42088a.equals(y6a0Var.f42088a) && Intrinsics.d(this.b, y6a0Var.b) && Intrinsics.d(this.c, y6a0Var.c) && this.d.equals(y6a0Var.d) && Intrinsics.d(this.e, y6a0Var.e) && this.f == y6a0Var.f;
    }

    public final int hashCode() {
        int iA = dw9.a(this.f42088a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (this.d.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        l9s l9sVar = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (l9sVar != null ? l9sVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PlayerMarketsStateModel(marketsState=" + this.f42088a + ", markets=" + this.b + ", playerId=" + this.c + ", marketPropertiesModel=" + this.d + ", gameDetailsModel=" + this.e + ", rtlSupport=" + this.f + Separators.RPAREN;
    }
}
