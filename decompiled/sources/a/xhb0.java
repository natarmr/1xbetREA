package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class xhb0 {
    public static final whb0 Companion = new whb0();
    public static final a8z[] e = {null, null, maz.a(wez.f39042a, new npa0(15)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f40882a;
    public final String b;
    public final List c;
    public final Long d;

    public /* synthetic */ xhb0(int i, Long l, Long l2, String str, List list) {
        if ((i & 1) == 0) {
            this.f40882a = null;
        } else {
            this.f40882a = l;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhb0)) {
            return false;
        }
        xhb0 xhb0Var = (xhb0) obj;
        return Intrinsics.d(this.f40882a, xhb0Var.f40882a) && Intrinsics.d(this.b, xhb0Var.b) && Intrinsics.d(this.c, xhb0Var.c) && Intrinsics.d(this.d, xhb0Var.d);
    }

    public final int hashCode() {
        Long l = this.f40882a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.d;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f40882a, "PopularTeamResponse(nameId=", ", originalName=", this.b, ", images=");
        sbS.append(this.c);
        sbS.append(", subsportId=");
        sbS.append(this.d);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
