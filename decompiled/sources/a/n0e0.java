package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class n0e0 {
    public static final m0e0 Companion = new m0e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f22696a;
    public final String b;
    public final String c;
    public final String d;
    public final q0e0 e;

    public /* synthetic */ n0e0(int i, Integer num, String str, String str2, String str3, q0e0 q0e0Var) {
        if ((i & 1) == 0) {
            this.f22696a = null;
        } else {
            this.f22696a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = q0e0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0e0)) {
            return false;
        }
        n0e0 n0e0Var = (n0e0) obj;
        return Intrinsics.d(this.f22696a, n0e0Var.f22696a) && Intrinsics.d(this.b, n0e0Var.b) && Intrinsics.d(this.c, n0e0Var.c) && Intrinsics.d(this.d, n0e0Var.d) && Intrinsics.d(this.e, n0e0Var.e);
    }

    public final int hashCode() {
        Integer num = this.f22696a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        q0e0 q0e0Var = this.e;
        return iHashCode4 + (q0e0Var != null ? q0e0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f22696a, "RainbowStatisticMatchesTeamPlayerResponse(id=", ", name=", this.b, ", realName=");
        f140.v(sbN, this.c, ", image=", this.d, ", stats=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
