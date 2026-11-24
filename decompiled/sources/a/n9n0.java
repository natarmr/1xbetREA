package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class n9n0 {
    public static final m9n0 Companion = new m9n0();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new a7n0((byte) 8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f23150a;
    public final String b;
    public final Integer c;
    public final List d;

    public /* synthetic */ n9n0(int i, Integer num, Long l, String str, List list) {
        if ((i & 1) == 0) {
            this.f23150a = null;
        } else {
            this.f23150a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9n0)) {
            return false;
        }
        n9n0 n9n0Var = (n9n0) obj;
        return Intrinsics.d(this.f23150a, n9n0Var.f23150a) && Intrinsics.d(this.b, n9n0Var.b) && Intrinsics.d(this.c, n9n0Var.c) && Intrinsics.d(this.d, n9n0Var.d);
    }

    public final int hashCode() {
        Long l = this.f23150a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f23150a, "SubscriptionSubGamesForMainGameResponse(id=", ", subGameName=", this.b, ", gameTypeId=");
        sbS.append(this.c);
        sbS.append(", eventGroups=");
        sbS.append(this.d);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
