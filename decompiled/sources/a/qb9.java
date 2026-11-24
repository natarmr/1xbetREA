package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class qb9 {
    public static final pb9 Companion = new pb9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f28437a;
    public final Integer b;
    public final Integer c;

    public /* synthetic */ qb9(int i, Integer num, Integer num2, Integer num3) {
        if ((i & 1) == 0) {
            this.f28437a = null;
        } else {
            this.f28437a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb9)) {
            return false;
        }
        qb9 qb9Var = (qb9) obj;
        return Intrinsics.d(this.f28437a, qb9Var.f28437a) && Intrinsics.d(this.b, qb9Var.b) && Intrinsics.d(this.c, qb9Var.c);
    }

    public final int hashCode() {
        Integer num = this.f28437a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(hne.q("BuilderCouponGameKeyResponse(gameType=", this.f28437a, ", period=", this.b, ", gameVid="), this.c, Separators.RPAREN);
    }
}
