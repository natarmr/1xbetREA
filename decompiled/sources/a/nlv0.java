package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class nlv0 {
    public static final mlv0 Companion = new mlv0();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23746a;
    public final Integer b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new y9v0((byte) 9)), null, maz.a(wezVar, new y9v0((byte) 10))};
    }

    public /* synthetic */ nlv0(int i, Integer num, List list, List list2) {
        if ((i & 1) == 0) {
            this.f23746a = null;
        } else {
            this.f23746a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlv0)) {
            return false;
        }
        nlv0 nlv0Var = (nlv0) obj;
        return Intrinsics.d(this.f23746a, nlv0Var.f23746a) && Intrinsics.d(this.b, nlv0Var.b) && Intrinsics.d(this.c, nlv0Var.c);
    }

    public final int hashCode() {
        List list = this.f23746a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list2 = this.c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(cs0.r(this.b, "WinterGameResultResponse(players=", ", sportId=", ", response=", this.f23746a), this.c, Separators.RPAREN);
    }
}
