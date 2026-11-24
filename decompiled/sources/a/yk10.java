package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class yk10 {
    public static final xk10 Companion = new xk10();
    public static final a8z[] e = {maz.a(wez.f39042a, new gf10(5)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42766a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    public /* synthetic */ yk10(int i, Integer num, Integer num2, Integer num3, List list) {
        if ((i & 1) == 0) {
            this.f42766a = null;
        } else {
            this.f42766a = list;
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
            this.d = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk10)) {
            return false;
        }
        yk10 yk10Var = (yk10) obj;
        return Intrinsics.d(this.f42766a, yk10Var.f42766a) && Intrinsics.d(this.b, yk10Var.b) && Intrinsics.d(this.c, yk10Var.c) && Intrinsics.d(this.d, yk10Var.d);
    }

    public final int hashCode() {
        List list = this.f42766a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return ua80.l(cs0.r(this.b, "LuckyWheelBonusesResponse(bonuses=", ", numberOfBonuses=", ", pageNumber=", this.f42766a), this.c, ", numberOfBonusesPerPage=", this.d, Separators.RPAREN);
    }
}
