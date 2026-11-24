package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class du0 {
    public static final cu0 Companion = new cu0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f6677a;
    public final Integer b;
    public final ou0 c;

    public /* synthetic */ du0(int i, Long l, Integer num, ou0 ou0Var) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, bu0.f3207a.getDescriptor());
            throw null;
        }
        this.f6677a = l;
        this.b = num;
        this.c = ou0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du0)) {
            return false;
        }
        du0 du0Var = (du0) obj;
        return Intrinsics.d(this.f6677a, du0Var.f6677a) && Intrinsics.d(this.b, du0Var.b) && Intrinsics.d(this.c, du0Var.c);
    }

    public final int hashCode() {
        Long l = this.f6677a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        ou0 ou0Var = this.c;
        return iHashCode2 + (ou0Var != null ? ou0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = cs0.q(this.b, this.f6677a, "AggregatorGameFavoriteRequest(gameId=", ", subcategoryId=", ", metrics=");
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public du0(Long l, Integer num, ou0 ou0Var) {
        this.f6677a = l;
        this.b = num;
        this.c = ou0Var;
    }
}
