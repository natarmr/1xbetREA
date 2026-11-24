package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class j380 {
    public static final y280 Companion = new y280();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new i280(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15818a;
    public final Long b;
    public final List c;

    public /* synthetic */ j380(int i, Long l, String str, List list) {
        if ((i & 1) == 0) {
            this.f15818a = null;
        } else {
            this.f15818a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j380)) {
            return false;
        }
        j380 j380Var = (j380) obj;
        return Intrinsics.d(this.f15818a, j380Var.f15818a) && Intrinsics.d(this.b, j380Var.b) && Intrinsics.d(this.c, j380Var.c);
    }

    public final int hashCode() {
        String str = this.f15818a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(kng0.s(this.b, "OpponentResponse(fullName=", this.f15818a, ", countryId=", ", opps="), this.c, Separators.RPAREN);
    }
}
