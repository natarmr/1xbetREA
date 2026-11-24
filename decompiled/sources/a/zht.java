package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zht {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zo80 f44409a;
    public final bdq b;
    public final boolean c;
    public final yo80 d;
    public final yo80 e;
    public final boolean f;
    public final boolean g;
    public final List h;
    public final List i;
    public final String j;

    public zht(zo80 zo80Var, bdq bdqVar, boolean z, yo80 yo80Var, yo80 yo80Var2, boolean z2, boolean z3, List list, List list2, String str) {
        list.getClass();
        list2.getClass();
        str.getClass();
        this.f44409a = zo80Var;
        this.b = bdqVar;
        this.c = z;
        this.d = yo80Var;
        this.e = yo80Var2;
        this.f = z2;
        this.g = z3;
        this.h = list;
        this.i = list2;
        this.j = str;
    }

    public static zht a(zht zhtVar, zo80 zo80Var, bdq bdqVar, boolean z, yo80 yo80Var, yo80 yo80Var2, boolean z2, boolean z3, List list, List list2, int i) {
        if ((i & 1) != 0) {
            zo80Var = zhtVar.f44409a;
        }
        zo80 zo80Var2 = zo80Var;
        if ((i & 2) != 0) {
            bdqVar = zhtVar.b;
        }
        bdq bdqVar2 = bdqVar;
        if ((i & 4) != 0) {
            z = zhtVar.c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            yo80Var = zhtVar.d;
        }
        yo80 yo80Var3 = yo80Var;
        yo80 yo80Var4 = (i & 16) != 0 ? zhtVar.e : yo80Var2;
        boolean z5 = (i & 32) != 0 ? zhtVar.f : z2;
        boolean z6 = (i & 64) != 0 ? zhtVar.g : z3;
        List list3 = (i & 128) != 0 ? zhtVar.h : list;
        List list4 = (i & 256) != 0 ? zhtVar.i : list2;
        String str = zhtVar.j;
        zhtVar.getClass();
        list3.getClass();
        list4.getClass();
        str.getClass();
        return new zht(zo80Var2, bdqVar2, z4, yo80Var3, yo80Var4, z5, z6, list3, list4, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zht)) {
            return false;
        }
        zht zhtVar = (zht) obj;
        return this.f44409a.equals(zhtVar.f44409a) && this.b.equals(zhtVar.b) && this.c == zhtVar.c && this.d.equals(zhtVar.d) && this.e.equals(zhtVar.e) && this.f == zhtVar.f && this.g == zhtVar.g && Intrinsics.d(this.h, zhtVar.h) && Intrinsics.d(this.i, zhtVar.i) && Intrinsics.d(this.j, zhtVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + dw9.a(dw9.a(brm0.e(brm0.e((this.e.hashCode() + ((this.d.hashCode() + brm0.e((this.b.hashCode() + (this.f44409a.hashCode() * 31)) * 31, 31, this.c)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GenerateCouponState(paramsGenerateCoupon=");
        sb.append(this.f44409a);
        sb.append(", findCouponModel=");
        sb.append(this.b);
        sb.append(", generateCouponButtonClickable=");
        sb.append(this.c);
        sb.append(", betSumError=");
        sb.append(this.d);
        sb.append(", wontedSumError=");
        sb.append(this.e);
        sb.append(", isLoading=");
        sb.append(this.f);
        sb.append(", isError=");
        vqd.y(sb, ", sportTypeList=", this.h, ", outcomesTypeList=", this.g);
        sb.append(this.i);
        sb.append(", allString=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
