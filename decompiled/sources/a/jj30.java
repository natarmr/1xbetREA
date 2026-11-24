package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class jj30 {
    public static final ij30 Companion = new ij30();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new gj30(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l26 f16603a;
    public final l26 b;
    public final List c;

    public /* synthetic */ jj30(int i, l26 l26Var, l26 l26Var2, List list) {
        if ((i & 1) == 0) {
            this.f16603a = null;
        } else {
            this.f16603a = l26Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l26Var2;
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
        if (!(obj instanceof jj30)) {
            return false;
        }
        jj30 jj30Var = (jj30) obj;
        return Intrinsics.d(this.f16603a, jj30Var.f16603a) && Intrinsics.d(this.b, jj30Var.b) && Intrinsics.d(this.c, jj30Var.c);
    }

    public final int hashCode() {
        l26 l26Var = this.f16603a;
        int iHashCode = (l26Var == null ? 0 : l26Var.hashCode()) * 31;
        l26 l26Var2 = this.b;
        int iHashCode2 = (iHashCode + (l26Var2 == null ? 0 : l26Var2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MbCyberGroupBySportResponse(sport=");
        sb.append(this.f16603a);
        sb.append(", subSport=");
        sb.append(this.b);
        sb.append(", games=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
