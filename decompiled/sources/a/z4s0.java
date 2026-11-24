package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class z4s0 {
    public static final u4s0 Companion = new u4s0();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new yqr0(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f43786a;
    public final String b;
    public final List c;

    public /* synthetic */ z4s0(int i, Integer num, String str, List list) {
        if ((i & 1) == 0) {
            this.f43786a = null;
        } else {
            this.f43786a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
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
        if (!(obj instanceof z4s0)) {
            return false;
        }
        z4s0 z4s0Var = (z4s0) obj;
        return Intrinsics.d(this.f43786a, z4s0Var.f43786a) && Intrinsics.d(this.b, z4s0Var.b) && Intrinsics.d(this.c, z4s0Var.c);
    }

    public final int hashCode() {
        Integer num = this.f43786a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(h97.n(this.f43786a, "TournamentResponse(sportId=", ", name=", this.b, ", stats="), this.c, Separators.RPAREN);
    }
}
