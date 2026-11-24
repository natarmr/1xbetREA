package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class wl60 {
    public static final vl60 Companion = new vl60();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39338a;
    public final Integer b;
    public final olp0 c;

    static {
        nlp0 nlp0Var = olp0.Companion;
        d = new a8z[]{maz.a(wez.f39042a, new th50((byte) 25)), null, null};
    }

    public /* synthetic */ wl60(int i, List list, Integer num, olp0 olp0Var) {
        if ((i & 1) == 0) {
            this.f39338a = null;
        } else {
            this.f39338a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = olp0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl60)) {
            return false;
        }
        wl60 wl60Var = (wl60) obj;
        return Intrinsics.d(this.f39338a, wl60Var.f39338a) && Intrinsics.d(this.b, wl60Var.b) && Intrinsics.d(this.c, wl60Var.c);
    }

    public final int hashCode() {
        List list = this.f39338a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        olp0 olp0Var = this.c;
        return iHashCode2 + (olp0Var != null ? olp0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = cs0.r(this.b, "OneTeamStatisticResponse(teams=", ", sportId=", ", response=", this.f39338a);
        sbR.append(this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
