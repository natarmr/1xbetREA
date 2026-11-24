package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class fip0 {
    public static final aip0 Companion = new aip0();
    public static final a8z[] e = {null, null, maz.a(wez.f39042a, new mhp0(3)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9600a;
    public final String b;
    public final List c;
    public final String d;

    public /* synthetic */ fip0(int i, String str, String str2, String str3, List list) {
        if ((i & 1) == 0) {
            this.f9600a = null;
        } else {
            this.f9600a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fip0)) {
            return false;
        }
        fip0 fip0Var = (fip0) obj;
        return Intrinsics.d(this.f9600a, fip0Var.f9600a) && Intrinsics.d(this.b, fip0Var.b) && Intrinsics.d(this.c, fip0Var.c) && Intrinsics.d(this.d, fip0Var.d);
    }

    public final int hashCode() {
        String str = this.f9600a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TeamResponse(id=", this.f9600a, ", image=", this.b, ", subTeamResponses=");
        sbN.append(this.c);
        sbN.append(", title=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
