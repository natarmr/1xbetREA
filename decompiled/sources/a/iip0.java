package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class iip0 {
    public static final dip0 Companion = new dip0();
    public static final a8z[] f = {null, null, null, null, maz.a(wez.f39042a, new mhp0(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14838a;
    public final String b;
    public final Integer c;
    public final String d;
    public final List e;

    public /* synthetic */ iip0(int i, Integer num, String str, String str2, String str3, List list) {
        if ((i & 1) == 0) {
            this.f14838a = null;
        } else {
            this.f14838a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
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
        if (!(obj instanceof iip0)) {
            return false;
        }
        iip0 iip0Var = (iip0) obj;
        return Intrinsics.d(this.f14838a, iip0Var.f14838a) && Intrinsics.d(this.b, iip0Var.b) && Intrinsics.d(this.c, iip0Var.c) && Intrinsics.d(this.d, iip0Var.d) && Intrinsics.d(this.e, iip0Var.e);
    }

    public final int hashCode() {
        String str = this.f14838a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TeamResponse(id=", this.f14838a, ", title=", this.b, ", clId=");
        b1j.u(this.c, ", image=", this.d, ", subTeams=", sbN);
        return dw9.r(sbN, this.e, Separators.RPAREN);
    }
}
