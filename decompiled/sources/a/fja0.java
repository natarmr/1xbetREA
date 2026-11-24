package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fja0 {
    public static final fja0 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9630a;
    public final List b;
    public final int c;
    public final List d;

    static {
        iun iunVar = iun.f15405a;
        e = new fja0(0, iunVar, iunVar, iunVar);
    }

    public fja0(int i, List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f9630a = list;
        this.b = list2;
        this.c = i;
        this.d = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fja0)) {
            return false;
        }
        fja0 fja0Var = (fja0) obj;
        return Intrinsics.d(this.f9630a, fja0Var.f9630a) && Intrinsics.d(this.b, fja0Var.b) && this.c == fja0Var.c && Intrinsics.d(this.d, fja0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, dw9.a(this.f9630a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("PlayersStatisticModel(teams=", ", players=", this.f9630a, ", sportId=", this.b);
        sbT.append(this.c);
        sbT.append(", selectorTabs=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
