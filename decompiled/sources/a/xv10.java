package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xv10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41535a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;

    public xv10(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10) {
        rz4.B(list, list2, list3, list4, list5);
        rz4.B(list6, list7, list8, list9, list10);
        this.f41535a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        this.f = list6;
        this.g = list7;
        this.h = list8;
        this.i = list9;
        this.j = list10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv10)) {
            return false;
        }
        xv10 xv10Var = (xv10) obj;
        return Intrinsics.d(this.f41535a, xv10Var.f41535a) && Intrinsics.d(this.b, xv10Var.b) && Intrinsics.d(this.c, xv10Var.c) && Intrinsics.d(this.d, xv10Var.d) && Intrinsics.d(this.e, xv10Var.e) && Intrinsics.d(this.f, xv10Var.f) && Intrinsics.d(this.g, xv10Var.g) && Intrinsics.d(this.h, xv10Var.h) && Intrinsics.d(this.i, xv10Var.i) && Intrinsics.d(this.j, xv10Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + dw9.a(dw9.a(dw9.a(dw9.a(dw9.a(dw9.a(dw9.a(dw9.a(this.f41535a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("MainMenuConfigModel(topMenuItemsOrder=", ", singleTopMenuItemsOrder=", this.f41535a, ", sportMenuItemsOrder=", this.b);
        b1j.y(", singleSportMenuItemsOrder=", ", aggregatorMenuItemsOrder=", sbT, this.c, this.d);
        b1j.y(", singleAggregatorMenuItemsOrder=", ", xGamesMenuItemsOrder=", sbT, this.e, this.f);
        b1j.y(", singleXGamesMenuItemsOrder=", ", otherMenuItemsOrder=", sbT, this.g, this.h);
        return kng0.n(", singleOtherMenuItemsOrder=", Separators.RPAREN, sbT, this.i, this.j);
    }
}
