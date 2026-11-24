package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rdc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30283a;
    public final double b;
    public final i8r c;
    public final String d;
    public final boolean e;
    public final double f;
    public final Double g;
    public final boolean h;
    public final z85 i;

    public rdc(List list, double d, i8r i8rVar, String str, boolean z, double d2, Double d3, boolean z2, z85 z85Var) {
        list.getClass();
        this.f30283a = list;
        this.b = d;
        this.c = i8rVar;
        this.d = str;
        this.e = z;
        this.f = d2;
        this.g = d3;
        this.h = z2;
        this.i = z85Var;
    }

    public static rdc a(rdc rdcVar, List list, double d, i8r i8rVar, String str, boolean z, double d2, Double d3, boolean z2, z85 z85Var, int i) {
        if ((i & 1) != 0) {
            list = rdcVar.f30283a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            d = rdcVar.b;
        }
        double d4 = d;
        i8r i8rVar2 = (i & 4) != 0 ? rdcVar.c : i8rVar;
        String str2 = (i & 8) != 0 ? rdcVar.d : str;
        boolean z3 = (i & 16) != 0 ? rdcVar.e : z;
        double d5 = (i & 32) != 0 ? rdcVar.f : d2;
        Double d6 = (i & 64) != 0 ? rdcVar.g : d3;
        boolean z4 = (i & 128) != 0 ? rdcVar.h : z2;
        z85 z85Var2 = (i & 256) != 0 ? rdcVar.i : z85Var;
        rdcVar.getClass();
        list2.getClass();
        return new rdc(list2, d4, i8rVar2, str2, z3, d5, d6, z4, z85Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdc)) {
            return false;
        }
        rdc rdcVar = (rdc) obj;
        return Intrinsics.d(this.f30283a, rdcVar.f30283a) && Double.compare(this.b, rdcVar.b) == 0 && Intrinsics.d(this.c, rdcVar.c) && this.d.equals(rdcVar.d) && this.e == rdcVar.e && Double.compare(this.f, rdcVar.f) == 0 && Intrinsics.d(this.g, rdcVar.g) && this.h == rdcVar.h && Intrinsics.d(this.i, rdcVar.i);
    }

    public final int hashCode() {
        int iD = brm0.d(this.b, this.f30283a.hashCode() * 31, 31);
        i8r i8rVar = this.c;
        int iD2 = brm0.d(this.f, brm0.e(ua80.b((iD + (i8rVar == null ? 0 : i8rVar.hashCode())) * 31, 31, this.d), 31, this.e), 31);
        Double d = this.g;
        int iE = brm0.e((iD2 + (d == null ? 0 : d.hashCode())) * 31, 31, this.h);
        z85 z85Var = this.i;
        return iE + (z85Var != null ? z85Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChoiceNewLimitNeState(availableValuesList=");
        sb.append(this.f30283a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", freeValueConfigurationModel=");
        sb.append(this.c);
        sb.append(", currency=");
        sb.append(this.d);
        rz4.A(sb, ", incorrectUserEntryLimit=", this.e, ", initialValue=");
        sb.append(this.f);
        sb.append(", pendingValue=");
        sb.append(this.g);
        sb.append(", isLoading=");
        sb.append(this.h);
        sb.append(", selectedLimit=");
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
