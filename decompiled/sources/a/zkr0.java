package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class zkr0 {
    public static final ykr0 Companion = new ykr0();
    public static final a8z[] g = {null, null, null, maz.a(wez.f39042a, new dfr0(7)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f44548a;
    public final Integer b;
    public final Long c;
    public final List d;
    public final Double e;
    public final String f;

    public /* synthetic */ zkr0(int i, Long l, Integer num, Long l2, List list, Double d, String str) {
        if (63 != (i & 63)) {
            m2x.I(i, 63, xkr0.f41041a.getDescriptor());
            throw null;
        }
        this.f44548a = l;
        this.b = num;
        this.c = l2;
        this.d = list;
        this.e = d;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkr0)) {
            return false;
        }
        zkr0 zkr0Var = (zkr0) obj;
        return Intrinsics.d(this.f44548a, zkr0Var.f44548a) && Intrinsics.d(this.b, zkr0Var.b) && Intrinsics.d(this.c, zkr0Var.c) && Intrinsics.d(this.d, zkr0Var.d) && Intrinsics.d(this.e, zkr0Var.e) && Intrinsics.d(this.f, zkr0Var.f);
    }

    public final int hashCode() {
        Long l = this.f44548a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.c;
        int iA = dw9.a((iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.d);
        Double d = this.e;
        int iHashCode3 = (iA + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.f;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = cs0.q(this.b, this.f44548a, "TotoBetRequest(accountId=", ", totoTypeId=", ", tirageNumber=");
        twn.z(sbQ, this.c, ", arrayBet=", this.d, ", betSum=");
        sbQ.append(this.e);
        sbQ.append(", promoCode=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public zkr0(Long l, Integer num, Long l2, ArrayList arrayList, Double d, String str) {
        this.f44548a = l;
        this.b = num;
        this.c = l2;
        this.d = arrayList;
        this.e = d;
        this.f = str;
    }
}
