package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class q9e0 {
    public static final o9e0 Companion = new o9e0();
    public static final a8z[] f = {null, null, null, maz.a(wez.f39042a, new o6e0(3)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f28343a;
    public final Long b;
    public final Long c;
    public final List d;
    public final String e;

    public /* synthetic */ q9e0(int i, Long l, Long l2, Long l3, List list, String str) {
        if ((i & 1) == 0) {
            this.f28343a = null;
        } else {
            this.f28343a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9e0)) {
            return false;
        }
        q9e0 q9e0Var = (q9e0) obj;
        return Intrinsics.d(this.f28343a, q9e0Var.f28343a) && Intrinsics.d(this.b, q9e0Var.b) && Intrinsics.d(this.c, q9e0Var.c) && Intrinsics.d(this.d, q9e0Var.d) && Intrinsics.d(this.e, q9e0Var.e);
    }

    public final int hashCode() {
        Long l = this.f28343a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.e;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f28343a, this.b, "RatingValueColResponse(id=", ", contentType=", ", ratingSpecialType=");
        twn.z(sbO, this.c, ", value=", this.d, ", competitorId=");
        return axq.n(sbO, this.e, Separators.RPAREN);
    }
}
