package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ub9 {
    public static final tb9 Companion = new tb9();
    public static final a8z[] e = {null, null, maz.a(wez.f39042a, new ej8(13)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f35369a;
    public final qb9 b;
    public final List c;
    public final String d;

    public /* synthetic */ ub9(int i, Long l, qb9 qb9Var, List list, String str) {
        if ((i & 1) == 0) {
            this.f35369a = null;
        } else {
            this.f35369a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = qb9Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub9)) {
            return false;
        }
        ub9 ub9Var = (ub9) obj;
        return Intrinsics.d(this.f35369a, ub9Var.f35369a) && Intrinsics.d(this.b, ub9Var.b) && Intrinsics.d(this.c, ub9Var.c) && Intrinsics.d(this.d, ub9Var.d);
    }

    public final int hashCode() {
        Long l = this.f35369a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        qb9 qb9Var = this.b;
        int iHashCode2 = (iHashCode + (qb9Var == null ? 0 : qb9Var.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "BuilderCouponGameResponse(gameId=" + this.f35369a + ", key=" + this.b + ", events=" + this.c + ", gameTypeName=" + this.d + Separators.RPAREN;
    }
}
