package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kx20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19032a;
    public final int b;
    public final ArrayList c;
    public final List d;
    public final List e;

    public kx20(int i, int i2, ArrayList arrayList, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f19032a = i;
        this.b = i2;
        this.c = arrayList;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx20)) {
            return false;
        }
        kx20 kx20Var = (kx20) obj;
        return this.f19032a == kx20Var.f19032a && this.b == kx20Var.b && this.c.equals(kx20Var.c) && Intrinsics.d(this.d, kx20Var.d) && Intrinsics.d(this.e, kx20Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a(twn.g(this.c, twn.a(this.b, Integer.hashCode(this.f19032a) * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("MarketStatisticGraphModel(id=", this.f19032a, ", index=", ", items=", this.b);
        sbT.append(this.c);
        sbT.append(", params=");
        sbT.append(this.d);
        sbT.append(", playerNames=");
        return dw9.r(sbT, this.e, Separators.RPAREN);
    }
}
