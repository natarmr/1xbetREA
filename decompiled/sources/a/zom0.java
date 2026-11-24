package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class zom0 {
    public static final yom0 Companion = new yom0();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f44727a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;

    static {
        wez wezVar = wez.f39042a;
        f = new a8z[]{null, maz.a(wezVar, new x9m0((byte) 9)), maz.a(wezVar, new x9m0((byte) 10)), maz.a(wezVar, new x9m0((byte) 11)), maz.a(wezVar, new x9m0((byte) 12))};
    }

    public /* synthetic */ zom0(int i, Double d, List list, List list2, List list3, List list4) {
        if ((i & 1) == 0) {
            this.f44727a = null;
        } else {
            this.f44727a = d;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zom0)) {
            return false;
        }
        zom0 zom0Var = (zom0) obj;
        return Intrinsics.d(this.f44727a, zom0Var.f44727a) && Intrinsics.d(this.b, zom0Var.b) && Intrinsics.d(this.c, zom0Var.c) && Intrinsics.d(this.d, zom0Var.d) && Intrinsics.d(this.e, zom0Var.e);
    }

    public final int hashCode() {
        Double d = this.f44727a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.d;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.e;
        return iHashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StepInfoResponse(coeff=");
        sb.append(this.f44727a);
        sb.append(", coeffInfo=");
        sb.append(this.b);
        sb.append(", newCrystals=");
        b1j.y(", map=", ", winningCombination=", sb, this.c, this.d);
        return dw9.r(sb, this.e, Separators.RPAREN);
    }
}
