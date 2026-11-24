package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class aep0 {
    public static final zdp0 Companion = new zdp0();
    public static final a8z[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f740a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final clp0 g;
    public final clp0 h;
    public final Integer i;
    public final Integer j;

    static {
        wez wezVar = wez.f39042a;
        k = new a8z[]{null, maz.a(wezVar, new ccp0((byte) 6)), maz.a(wezVar, new ccp0((byte) 7)), maz.a(wezVar, new ccp0((byte) 8)), maz.a(wezVar, new ccp0((byte) 9)), maz.a(wezVar, new ccp0((byte) 10)), null, null, null, null};
    }

    public /* synthetic */ aep0(int i, Integer num, List list, List list2, List list3, List list4, List list5, clp0 clp0Var, clp0 clp0Var2, Integer num2, Integer num3) {
        if ((i & 1) == 0) {
            this.f740a = null;
        } else {
            this.f740a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = clp0Var;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = clp0Var2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aep0)) {
            return false;
        }
        aep0 aep0Var = (aep0) obj;
        return Intrinsics.d(this.f740a, aep0Var.f740a) && Intrinsics.d(this.b, aep0Var.b) && Intrinsics.d(this.c, aep0Var.c) && Intrinsics.d(this.d, aep0Var.d) && Intrinsics.d(this.e, aep0Var.e) && Intrinsics.d(this.f, aep0Var.f) && Intrinsics.d(this.g, aep0Var.g) && Intrinsics.d(this.h, aep0Var.h) && Intrinsics.d(this.i, aep0Var.i) && Intrinsics.d(this.j, aep0Var.j);
    }

    public final int hashCode() {
        Integer num = this.f740a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.d;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.e;
        int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.f;
        int iHashCode6 = (iHashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
        clp0 clp0Var = this.g;
        int iHashCode7 = (iHashCode6 + (clp0Var == null ? 0 : clp0Var.hashCode())) * 31;
        clp0 clp0Var2 = this.h;
        int iHashCode8 = (iHashCode7 + (clp0Var2 == null ? 0 : clp0Var2.hashCode())) * 31;
        Integer num2 = this.i;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.j;
        return iHashCode9 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamGames(drowCount=");
        sb.append(this.f740a);
        sb.append(", games=");
        sb.append(this.b);
        sb.append(", team1FutureGames=");
        b1j.y(", team1Games=", ", team2FutureGames=", sb, this.c, this.d);
        b1j.y(", team2Games=", ", teamStat1=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", teamStat2=");
        sb.append(this.h);
        sb.append(", winCount1=");
        return ua80.l(sb, this.i, ", winCount2=", this.j, Separators.RPAREN);
    }
}
