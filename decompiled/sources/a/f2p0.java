package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class f2p0 {
    public static final e2p0 Companion = new e2p0();
    public static final a8z[] f = {null, null, null, null, maz.a(wez.f39042a, new fno0(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8824a;
    public final String b;
    public final Long c;
    public final String d;
    public final List e;

    public /* synthetic */ f2p0(int i, Long l, String str, String str2, String str3, List list) {
        if ((i & 1) == 0) {
            this.f8824a = null;
        } else {
            this.f8824a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2p0)) {
            return false;
        }
        f2p0 f2p0Var = (f2p0) obj;
        return Intrinsics.d(this.f8824a, f2p0Var.f8824a) && Intrinsics.d(this.b, f2p0Var.b) && Intrinsics.d(this.c, f2p0Var.c) && Intrinsics.d(this.d, f2p0Var.d) && Intrinsics.d(this.e, f2p0Var.e);
    }

    public final int hashCode() {
        String str = this.f8824a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TeamBetStatisticTeamResponse(id=", this.f8824a, ", title=", this.b, ", clId=");
        rz4.v(this.c, ", image=", this.d, ", subTeams=", sbN);
        return dw9.r(sbN, this.e, Separators.RPAREN);
    }
}
