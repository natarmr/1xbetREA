package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class or6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25720a;
    public final List b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final bq6 h;
    public final gio i;

    static {
        gio gioVar = gio.d;
    }

    public or6(List list, List list2, int i, boolean z, boolean z2, boolean z3, boolean z4, bq6 bq6Var, gio gioVar) {
        list.getClass();
        list2.getClass();
        gioVar.getClass();
        this.f25720a = list;
        this.b = list2;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = bq6Var;
        this.i = gioVar;
    }

    public static or6 a(or6 or6Var, List list, List list2, int i, boolean z, boolean z2, boolean z3, gio gioVar, int i2) {
        if ((i2 & 1) != 0) {
            list = or6Var.f25720a;
        }
        List list3 = list;
        if ((i2 & 2) != 0) {
            list2 = or6Var.b;
        }
        List list4 = list2;
        if ((i2 & 4) != 0) {
            i = or6Var.c;
        }
        int i3 = i;
        boolean z4 = or6Var.d;
        boolean z5 = (i2 & 16) != 0 ? or6Var.e : z;
        boolean z6 = (i2 & 32) != 0 ? or6Var.f : z2;
        boolean z7 = (i2 & 64) != 0 ? or6Var.g : z3;
        bq6 bq6Var = or6Var.h;
        gio gioVar2 = (i2 & 256) != 0 ? or6Var.i : gioVar;
        or6Var.getClass();
        list3.getClass();
        list4.getClass();
        gioVar2.getClass();
        return new or6(list3, list4, i3, z4, z5, z6, z7, bq6Var, gioVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or6)) {
            return false;
        }
        or6 or6Var = (or6) obj;
        return Intrinsics.d(this.f25720a, or6Var.f25720a) && Intrinsics.d(this.b, or6Var.b) && this.c == or6Var.c && this.d == or6Var.d && this.e == or6Var.e && this.f == or6Var.f && this.g == or6Var.g && this.h == or6Var.h && Intrinsics.d(this.i, or6Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(twn.a(this.c, dw9.a(this.f25720a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("BetConstructorGamesState(sportChips=", ", games=", this.f25720a, ", selectedTab=", this.b);
        brm0.w(this.c, ", supportRtl=", ", showMakeBet=", sbT, this.d);
        ua80.u(", isLoading=", ", isError=", sbT, this.e, this.f);
        sbT.append(this.g);
        sbT.append(", cardStyle=");
        sbT.append(this.h);
        sbT.append(", eventNamesModel=");
        sbT.append(this.i);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
