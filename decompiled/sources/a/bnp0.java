package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class bnp0 {
    public static final anp0 Companion = new anp0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f2896a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ bnp0(int i, Boolean bool, Long l, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f2896a = null;
        } else {
            this.f2896a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnp0)) {
            return false;
        }
        bnp0 bnp0Var = (bnp0) obj;
        return Intrinsics.d(this.f2896a, bnp0Var.f2896a) && Intrinsics.d(this.b, bnp0Var.b) && Intrinsics.d(this.c, bnp0Var.c) && Intrinsics.d(this.d, bnp0Var.d) && Intrinsics.d(this.e, bnp0Var.e);
    }

    public final int hashCode() {
        Boolean bool = this.f2896a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamTransferValueResponse(isIncoming=");
        sb.append(this.f2896a);
        sb.append(", dateInSecondsUnixTime=");
        sb.append(this.b);
        sb.append(", playerId=");
        f140.v(sb, this.c, ", teamId=", this.d, ", transferTypeTitle=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
