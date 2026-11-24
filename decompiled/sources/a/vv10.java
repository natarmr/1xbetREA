package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class vv10 {
    public static final uv10 Companion = new uv10();
    public static final a8z[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38077a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;

    static {
        wez wezVar = wez.f39042a;
        k = new a8z[]{maz.a(wezVar, new sv10((byte) 0)), maz.a(wezVar, new sv10((byte) 1)), maz.a(wezVar, new sv10((byte) 2)), maz.a(wezVar, new sv10((byte) 3)), maz.a(wezVar, new sv10((byte) 4)), maz.a(wezVar, new sv10((byte) 5)), maz.a(wezVar, new sv10((byte) 6)), maz.a(wezVar, new sv10((byte) 7)), maz.a(wezVar, new sv10((byte) 8)), maz.a(wezVar, new sv10((byte) 9))};
    }

    public /* synthetic */ vv10(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10) {
        if ((i & 1) == 0) {
            this.f38077a = null;
        } else {
            this.f38077a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list7;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list8;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list9;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv10)) {
            return false;
        }
        vv10 vv10Var = (vv10) obj;
        return Intrinsics.d(this.f38077a, vv10Var.f38077a) && Intrinsics.d(this.b, vv10Var.b) && Intrinsics.d(this.c, vv10Var.c) && Intrinsics.d(this.d, vv10Var.d) && Intrinsics.d(this.e, vv10Var.e) && Intrinsics.d(this.f, vv10Var.f) && Intrinsics.d(this.g, vv10Var.g) && Intrinsics.d(this.h, vv10Var.h) && Intrinsics.d(this.i, vv10Var.i) && Intrinsics.d(this.j, vv10Var.j);
    }

    public final int hashCode() {
        List list = this.f38077a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.d;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.e;
        int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.f;
        int iHashCode6 = (iHashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List list7 = this.g;
        int iHashCode7 = (iHashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List list8 = this.h;
        int iHashCode8 = (iHashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List list9 = this.i;
        int iHashCode9 = (iHashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List list10 = this.j;
        return iHashCode9 + (list10 != null ? list10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("MainMenu(topMenuItemsOrder=", ", singleTopMenuItemsOrder=", this.f38077a, ", sportMenuItemsOrder=", this.b);
        b1j.y(", singleSportMenuItemsOrder=", ", aggregatorMenuItemsOrder=", sbT, this.c, this.d);
        b1j.y(", singleAggregatorMenuItemsOrder=", ", xGamesMenuItemsOrder=", sbT, this.e, this.f);
        b1j.y(", singleXGamesMenuItemsOrder=", ", otherMenuItemsOrder=", sbT, this.g, this.h);
        return kng0.n(", singleOtherMenuItemsOrder=", Separators.RPAREN, sbT, this.i, this.j);
    }
}
