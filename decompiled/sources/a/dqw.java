package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dqw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6533a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;
    public final zdm0 i;
    public final nc5 j;

    public dqw(boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, List list, zdm0 zdm0Var, nc5 nc5Var) {
        list.getClass();
        this.f6533a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = list;
        this.i = zdm0Var;
        this.j = nc5Var;
    }

    public static dqw a(dqw dqwVar, boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, ArrayList arrayList, nc5 nc5Var, int i) {
        if ((i & 1) != 0) {
            z = dqwVar.f6533a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = dqwVar.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = dqwVar.c;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            str = dqwVar.d;
        }
        String str5 = str;
        String str6 = (i & 16) != 0 ? dqwVar.e : str2;
        String str7 = (i & 32) != 0 ? dqwVar.f : str3;
        String str8 = (i & 64) != 0 ? dqwVar.g : str4;
        List list = (i & 128) != 0 ? dqwVar.h : arrayList;
        zdm0 zdm0Var = dqwVar.i;
        nc5 nc5Var2 = (i & 512) != 0 ? dqwVar.j : nc5Var;
        dqwVar.getClass();
        str5.getClass();
        str7.getClass();
        str8.getClass();
        list.getClass();
        return new dqw(z4, z5, z6, str5, str6, str7, str8, list, zdm0Var, nc5Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqw)) {
            return false;
        }
        dqw dqwVar = (dqw) obj;
        return this.f6533a == dqwVar.f6533a && this.b == dqwVar.b && this.c == dqwVar.c && this.d.equals(dqwVar.d) && this.e.equals(dqwVar.e) && this.f.equals(dqwVar.f) && this.g.equals(dqwVar.g) && Intrinsics.d(this.h, dqwVar.h) && this.i.equals(dqwVar.i) && this.j.equals(dqwVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + kng0.a(this.i, dw9.a(ua80.b(ua80.b(ua80.b(ua80.b(brm0.e(brm0.e(Boolean.hashCode(this.f6533a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("HorsesRaceMenuState(isLoading=", ", isError=", ", isEmpty=", this.f6533a, this.b);
        f140.s(", statId=", this.d, ", subtitle=", sbQ, this.c);
        f140.v(sbQ, this.e, ", title=", this.f, ", dateStart=");
        cs0.y(this.g, ", menuItemList=", ", statisticHeaderUiModel=", sbQ, this.h);
        sbQ.append(this.i);
        sbQ.append(", backgroundHeaderModel=");
        sbQ.append(this.j);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
