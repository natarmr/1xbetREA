package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nl8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23715a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final mdm e;
    public final boolean f;

    public nl8(List list, int i, boolean z, boolean z2, mdm mdmVar, boolean z3) {
        list.getClass();
        this.f23715a = list;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = mdmVar;
        this.f = z3;
    }

    public static nl8 a(nl8 nl8Var, List list, int i, boolean z, boolean z2, mdm mdmVar, int i2) {
        if ((i2 & 1) != 0) {
            list = nl8Var.f23715a;
        }
        List list2 = list;
        if ((i2 & 2) != 0) {
            i = nl8Var.b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            z = nl8Var.c;
        }
        boolean z3 = z;
        if ((i2 & 8) != 0) {
            z2 = nl8Var.d;
        }
        boolean z4 = z2;
        if ((i2 & 16) != 0) {
            mdmVar = nl8Var.e;
        }
        boolean z5 = nl8Var.f;
        nl8Var.getClass();
        list2.getClass();
        return new nl8(list2, i3, z3, z4, mdmVar, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl8)) {
            return false;
        }
        nl8 nl8Var = (nl8) obj;
        return Intrinsics.d(this.f23715a, nl8Var.f23715a) && this.b == nl8Var.b && this.c == nl8Var.c && this.d == nl8Var.d && Intrinsics.d(this.e, nl8Var.e) && this.f == nl8Var.f;
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(twn.a(this.b, this.f23715a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        mdm mdmVar = this.e;
        return Boolean.hashCode(this.f) + ((iE + (mdmVar == null ? 0 : mdmVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusesStateModel(bonuses=");
        sb.append(this.f23715a);
        sb.append(", selectedBonusId=");
        sb.append(this.b);
        sb.append(", showLoading=");
        ua80.u(", showEmptyView=", ", emptyView=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", hasClaimButton=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
