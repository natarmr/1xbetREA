package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class h8g0 {
    public static final g8g0 Companion = new g8g0();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12624a;
    public final String b;
    public final r7g0 c;
    public final List d;

    static {
        q7g0 q7g0Var = r7g0.Companion;
        e = new a8z[]{null, null, null, maz.a(wez.f39042a, new j6g0((byte) 3))};
    }

    public /* synthetic */ h8g0(int i, String str, String str2, r7g0 r7g0Var, List list) {
        if ((i & 1) == 0) {
            this.f12624a = null;
        } else {
            this.f12624a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = r7g0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8g0)) {
            return false;
        }
        h8g0 h8g0Var = (h8g0) obj;
        return Intrinsics.d(this.f12624a, h8g0Var.f12624a) && Intrinsics.d(this.b, h8g0Var.b) && Intrinsics.d(this.c, h8g0Var.c) && Intrinsics.d(this.d, h8g0Var.d);
    }

    public final int hashCode() {
        String str = this.f12624a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        r7g0 r7g0Var = this.c;
        int iHashCode3 = (iHashCode2 + (r7g0Var == null ? 0 : r7g0Var.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ResultsGridValueResponse(title=", this.f12624a, ", logoUrl=", this.b, ", table=");
        sbN.append(this.c);
        sbN.append(", tableFooterList=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
