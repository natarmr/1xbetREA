package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class web {
    public static final reb Companion = new reb();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new e0b(12))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l26 f39011a;
    public final l26 b;
    public final List c;

    public /* synthetic */ web(int i, l26 l26Var, l26 l26Var2, List list) {
        if ((i & 1) == 0) {
            this.f39011a = null;
        } else {
            this.f39011a = l26Var;
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
        if (!(obj instanceof web)) {
            return false;
        }
        web webVar = (web) obj;
        return Intrinsics.d(this.f39011a, webVar.f39011a) && Intrinsics.d(this.b, webVar.b) && Intrinsics.d(this.c, webVar.c);
    }

    public final int hashCode() {
        l26 l26Var = this.f39011a;
        int iHashCode = (l26Var == null ? 0 : l26Var.hashCode()) * 31;
        l26 l26Var2 = this.b;
        int iHashCode2 = (iHashCode + (l26Var2 == null ? 0 : l26Var2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChampResponse(sport=");
        sb.append(this.f39011a);
        sb.append(", subSport=");
        sb.append(this.b);
        sb.append(", ligas=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
