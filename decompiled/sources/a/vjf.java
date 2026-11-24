package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class vjf {
    public static final ujf Companion = new ujf();
    public static final a8z[] f = {null, null, null, null, maz.a(wez.f39042a, new x5f(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37525a;
    public final String b;
    public final Long c;
    public final String d;
    public final List e;

    public /* synthetic */ vjf(int i, Long l, String str, String str2, String str3, List list) {
        if ((i & 1) == 0) {
            this.f37525a = null;
        } else {
            this.f37525a = str;
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
        if (!(obj instanceof vjf)) {
            return false;
        }
        vjf vjfVar = (vjf) obj;
        return Intrinsics.d(this.f37525a, vjfVar.f37525a) && Intrinsics.d(this.b, vjfVar.b) && Intrinsics.d(this.c, vjfVar.c) && Intrinsics.d(this.d, vjfVar.d) && Intrinsics.d(this.e, vjfVar.e);
    }

    public final int hashCode() {
        String str = this.f37525a;
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
        StringBuilder sbN = b1j.n("Cs2CompositionTeamsResponse(teamId=", this.f37525a, ", teamTitle=", this.b, ", teamClId=");
        rz4.v(this.c, ", teamImage=", this.d, ", subTeams=", sbN);
        return dw9.r(sbN, this.e, Separators.RPAREN);
    }
}
