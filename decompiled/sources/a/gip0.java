package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class gip0 {
    public static final bip0 Companion = new bip0();
    public static final a8z[] f = {null, null, null, null, maz.a(wez.f39042a, new mhp0(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11360a;
    public final String b;
    public final Integer c;
    public final String d;
    public final List e;

    public /* synthetic */ gip0(int i, Integer num, String str, String str2, String str3, List list) {
        if ((i & 1) == 0) {
            this.f11360a = null;
        } else {
            this.f11360a = str;
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
        if (!(obj instanceof gip0)) {
            return false;
        }
        gip0 gip0Var = (gip0) obj;
        return Intrinsics.d(this.f11360a, gip0Var.f11360a) && Intrinsics.d(this.b, gip0Var.b) && Intrinsics.d(this.c, gip0Var.c) && Intrinsics.d(this.d, gip0Var.d) && Intrinsics.d(this.e, gip0Var.e);
    }

    public final int hashCode() {
        String str = this.f11360a;
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
        StringBuilder sbN = b1j.n("TeamResponse(id=", this.f11360a, ", title=", this.b, ", translationId=");
        b1j.u(this.c, ", image=", this.d, ", subTeams=", sbN);
        return dw9.r(sbN, this.e, Separators.RPAREN);
    }
}
