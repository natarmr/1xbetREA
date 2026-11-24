package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oaq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24940a;
    public final boolean b;
    public final Integer c;
    public final g9q d;
    public final eb8 e;
    public final kcq f;
    public final cev g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final wbq k;
    public final boolean l;

    public oaq(List list, boolean z, Integer num, g9q g9qVar, eb8 eb8Var, kcq kcqVar, cev cevVar, boolean z2, boolean z3, int i, wbq wbqVar, boolean z4) {
        list.getClass();
        this.f24940a = list;
        this.b = z;
        this.c = num;
        this.d = g9qVar;
        this.e = eb8Var;
        this.f = kcqVar;
        this.g = cevVar;
        this.h = z2;
        this.i = z3;
        this.j = i;
        this.k = wbqVar;
        this.l = z4;
    }

    public static oaq a(oaq oaqVar, List list, boolean z, Integer num, g9q g9qVar, eb8 eb8Var, kcq kcqVar, cev cevVar, boolean z2, boolean z3, int i, wbq wbqVar, boolean z4, int i2) {
        if ((i2 & 1) != 0) {
            list = oaqVar.f24940a;
        }
        List list2 = list;
        if ((i2 & 2) != 0) {
            z = oaqVar.b;
        }
        boolean z5 = z;
        Integer num2 = (i2 & 4) != 0 ? oaqVar.c : num;
        g9q g9qVar2 = (i2 & 8) != 0 ? oaqVar.d : g9qVar;
        eb8 eb8Var2 = (i2 & 16) != 0 ? oaqVar.e : eb8Var;
        kcq kcqVar2 = (i2 & 32) != 0 ? oaqVar.f : kcqVar;
        cev cevVar2 = (i2 & 64) != 0 ? oaqVar.g : cevVar;
        boolean z6 = (i2 & 128) != 0 ? oaqVar.h : z2;
        boolean z7 = (i2 & 256) != 0 ? oaqVar.i : z3;
        int i3 = (i2 & 512) != 0 ? oaqVar.j : i;
        wbq wbqVar2 = (i2 & 1024) != 0 ? oaqVar.k : wbqVar;
        boolean z8 = (i2 & 2048) != 0 ? oaqVar.l : z4;
        oaqVar.getClass();
        list2.getClass();
        return new oaq(list2, z5, num2, g9qVar2, eb8Var2, kcqVar2, cevVar2, z6, z7, i3, wbqVar2, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oaq)) {
            return false;
        }
        oaq oaqVar = (oaq) obj;
        return Intrinsics.d(this.f24940a, oaqVar.f24940a) && this.b == oaqVar.b && Intrinsics.d(this.c, oaqVar.c) && Intrinsics.d(this.d, oaqVar.d) && Intrinsics.d(this.e, oaqVar.e) && Intrinsics.d(this.f, oaqVar.f) && Intrinsics.d(this.g, oaqVar.g) && this.h == oaqVar.h && this.i == oaqVar.i && this.j == oaqVar.j && this.k == oaqVar.k && this.l == oaqVar.l;
    }

    public final int hashCode() {
        int iE = brm0.e(this.f24940a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        g9q g9qVar = this.d;
        int iHashCode2 = (iHashCode + (g9qVar == null ? 0 : g9qVar.hashCode())) * 31;
        eb8 eb8Var = this.e;
        int iHashCode3 = (iHashCode2 + (eb8Var == null ? 0 : eb8Var.hashCode())) * 31;
        kcq kcqVar = this.f;
        int iHashCode4 = (iHashCode3 + (kcqVar == null ? 0 : kcqVar.hashCode())) * 31;
        cev cevVar = this.g;
        return Boolean.hashCode(this.l) + ((this.k.hashCode() + twn.a(this.j, brm0.e(brm0.e((iHashCode4 + (cevVar != null ? cevVar.hashCode() : 0)) * 31, 31, this.h), 31, this.i), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinBetsState(financeInstrumentModelList=");
        sb.append(this.f24940a);
        sb.append(", quickBetActive=");
        sb.append(this.b);
        sb.append(", currentInstrumentId=");
        sb.append(this.c);
        sb.append(", balance=");
        sb.append(this.d);
        sb.append(", boardInfoModel=");
        sb.append(this.e);
        sb.append(", financeObjectModel=");
        sb.append(this.f);
        sb.append(", graphPointInfoModel=");
        sb.append(this.g);
        sb.append(", isLoading=");
        sb.append(this.h);
        sb.append(", isError=");
        ua80.q(this.j, ", selectedIndex=", ", selectedType=", sb, this.i);
        sb.append(this.k);
        sb.append(", pendingBet=");
        sb.append(this.l);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
