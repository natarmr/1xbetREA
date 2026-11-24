package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ec80 implements hc80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7552a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;

    public ec80(List list, List list2, List list3, List list4, List list5) {
        rz4.B(list, list2, list3, list4, list5);
        this.f7552a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
    }

    public static ec80 a(ec80 ec80Var, ArrayList arrayList, List list, int i) {
        List list2 = ec80Var.f7552a;
        List list3 = ec80Var.b;
        List list4 = ec80Var.c;
        List list5 = arrayList;
        if ((i & 8) != 0) {
            list5 = ec80Var.d;
        }
        List list6 = list5;
        if ((i & 16) != 0) {
            list = ec80Var.e;
        }
        List list7 = list;
        ec80Var.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list6.getClass();
        list7.getClass();
        return new ec80(list2, list3, list4, list6, list7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec80)) {
            return false;
        }
        ec80 ec80Var = (ec80) obj;
        return Intrinsics.d(this.f7552a, ec80Var.f7552a) && Intrinsics.d(this.b, ec80Var.b) && Intrinsics.d(this.c, ec80Var.c) && Intrinsics.d(this.d, ec80Var.d) && Intrinsics.d(this.e, ec80Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a(dw9.a(dw9.a(this.f7552a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("Favorites(teams=", ", champs=", this.f7552a, ", oneXGames=", this.b);
        b1j.y(", aggregatorGames=", ", recommendedChamps=", sbT, this.c, this.d);
        return dw9.r(sbT, this.e, Separators.RPAREN);
    }
}
