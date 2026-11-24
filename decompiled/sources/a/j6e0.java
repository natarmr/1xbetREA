package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class j6e0 {
    public static final h6e0 Companion = new h6e0();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9e0 f15981a;
    public final Integer b;
    public final List c;
    public final List d;
    public final List e;

    static {
        s9e0 s9e0Var = t9e0.Companion;
        wez wezVar = wez.f39042a;
        f = new a8z[]{null, null, maz.a(wezVar, new etd0((byte) 26)), maz.a(wezVar, new etd0((byte) 27)), maz.a(wezVar, new etd0((byte) 28))};
    }

    public /* synthetic */ j6e0(int i, t9e0 t9e0Var, Integer num, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f15981a = null;
        } else {
            this.f15981a = t9e0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6e0)) {
            return false;
        }
        j6e0 j6e0Var = (j6e0) obj;
        return Intrinsics.d(this.f15981a, j6e0Var.f15981a) && Intrinsics.d(this.b, j6e0Var.b) && Intrinsics.d(this.c, j6e0Var.c) && Intrinsics.d(this.d, j6e0Var.d) && Intrinsics.d(this.e, j6e0Var.e);
    }

    public final int hashCode() {
        t9e0 t9e0Var = this.f15981a;
        int iHashCode = (t9e0Var == null ? 0 : t9e0Var.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.e;
        return iHashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RatingResponse(ratingValueResponse=");
        sb.append(this.f15981a);
        sb.append(", sportId=");
        sb.append(this.b);
        sb.append(", teams=");
        b1j.y(", players=", ", tournaments=", sb, this.c, this.d);
        return dw9.r(sb, this.e, Separators.RPAREN);
    }
}
