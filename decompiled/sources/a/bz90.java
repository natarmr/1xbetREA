package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class bz90 {
    public static final az90 Companion = new az90();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3455a;
    public final Integer b;
    public final Integer c;
    public final jz90 d;

    static {
        iz90 iz90Var = jz90.Companion;
        e = new a8z[]{maz.a(wez.f39042a, new wm90((byte) 10)), null, null, null};
    }

    public /* synthetic */ bz90(int i, List list, Integer num, Integer num2, jz90 jz90Var) {
        if ((i & 1) == 0) {
            this.f3455a = null;
        } else {
            this.f3455a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = jz90Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz90)) {
            return false;
        }
        bz90 bz90Var = (bz90) obj;
        return Intrinsics.d(this.f3455a, bz90Var.f3455a) && Intrinsics.d(this.b, bz90Var.b) && Intrinsics.d(this.c, bz90Var.c) && Intrinsics.d(this.d, bz90Var.d);
    }

    public final int hashCode() {
        List list = this.f3455a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        jz90 jz90Var = this.d;
        return iHashCode3 + (jz90Var != null ? jz90Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = cs0.r(this.b, "PlayerBiographyCommonResponse(teams=", ", sportId=", ", subSportId=", this.f3455a);
        sbR.append(this.c);
        sbR.append(", playerBiographyInfoResponse=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
