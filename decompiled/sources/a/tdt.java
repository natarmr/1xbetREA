package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tdt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f33786a;
    public final List b;
    public final List c;
    public final int d;
    public final int e;

    public tdt(int i, int i2, List list, List list2, List list3) {
        this.f33786a = list;
        this.b = list2;
        this.c = list3;
        this.d = i;
        this.e = i2;
    }

    public static tdt a(tdt tdtVar, List list, List list2, List list3, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            list = tdtVar.f33786a;
        }
        List list4 = list;
        if ((i3 & 2) != 0) {
            list2 = tdtVar.b;
        }
        List list5 = list2;
        if ((i3 & 4) != 0) {
            list3 = tdtVar.c;
        }
        List list6 = list3;
        if ((i3 & 8) != 0) {
            i = tdtVar.d;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = tdtVar.e;
        }
        return new tdt(i4, i2, list4, list5, list6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdt)) {
            return false;
        }
        tdt tdtVar = (tdt) obj;
        return Intrinsics.d(this.f33786a, tdtVar.f33786a) && Intrinsics.d(this.b, tdtVar.b) && Intrinsics.d(this.c, tdtVar.c) && this.d == tdtVar.d && this.e == tdtVar.e;
    }

    public final int hashCode() {
        List list = this.f33786a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        return Integer.hashCode(this.e) + twn.a(this.d, (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("GamesStateModel(gamesList=", ", cachedGamesList=", this.f33786a, ", favoriteGamesList=", this.b);
        brm0.v(this.d, ", listFirstVisibleItemIndex=", ", listFirstVisibleItemScrollOffset=", sbT, this.c);
        return rz4.j(this.e, Separators.RPAREN, sbT);
    }
}
