package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class xbc0 {
    public static final wbc0 Companion = new wbc0();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcc0 f40595a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;

    static {
        wez wezVar = wez.f39042a;
        f = new a8z[]{null, maz.a(wezVar, new cbc0((byte) 3)), maz.a(wezVar, new cbc0((byte) 4)), maz.a(wezVar, new cbc0((byte) 5)), maz.a(wezVar, new cbc0((byte) 6))};
    }

    public /* synthetic */ xbc0(int i, dcc0 dcc0Var, List list, List list2, List list3, List list4) {
        if ((i & 1) == 0) {
            this.f40595a = null;
        } else {
            this.f40595a = dcc0Var;
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
        if (!(obj instanceof xbc0)) {
            return false;
        }
        xbc0 xbc0Var = (xbc0) obj;
        return Intrinsics.d(this.f40595a, xbc0Var.f40595a) && Intrinsics.d(this.b, xbc0Var.b) && Intrinsics.d(this.c, xbc0Var.c) && Intrinsics.d(this.d, xbc0Var.d) && Intrinsics.d(this.e, xbc0Var.e);
    }

    public final int hashCode() {
        dcc0 dcc0Var = this.f40595a;
        int iHashCode = (dcc0Var == null ? 0 : dcc0Var.hashCode()) * 31;
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
        StringBuilder sb = new StringBuilder("PromoCmsGetPromotionTemplateInfoResponse(userData=");
        sb.append(this.f40595a);
        sb.append(", stageDraws=");
        sb.append(this.b);
        sb.append(", ticketsTypes=");
        b1j.y(", pointsTypes=", ", spinsTypes=", sb, this.c, this.d);
        return dw9.r(sb, this.e, Separators.RPAREN);
    }
}
