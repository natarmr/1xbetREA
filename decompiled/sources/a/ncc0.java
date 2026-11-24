package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ncc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rcc0 f23286a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;

    public ncc0(rcc0 rcc0Var, List list, List list2, List list3, List list4) {
        hne.C(list, list2, list3, list4);
        this.f23286a = rcc0Var;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncc0)) {
            return false;
        }
        ncc0 ncc0Var = (ncc0) obj;
        return Intrinsics.d(this.f23286a, ncc0Var.f23286a) && Intrinsics.d(this.b, ncc0Var.b) && Intrinsics.d(this.c, ncc0Var.c) && Intrinsics.d(this.d, ncc0Var.d) && Intrinsics.d(this.e, ncc0Var.e);
    }

    public final int hashCode() {
        rcc0 rcc0Var = this.f23286a;
        return this.e.hashCode() + dw9.a(dw9.a(dw9.a((rcc0Var == null ? 0 : rcc0Var.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoCmsPromotionInfoTemplateInfoModel(userData=");
        sb.append(this.f23286a);
        sb.append(", stageDraws=");
        sb.append(this.b);
        sb.append(", ticketsTypes=");
        b1j.y(", pointsTypes=", ", spinsTypes=", sb, this.c, this.d);
        return dw9.r(sb, this.e, Separators.RPAREN);
    }
}
