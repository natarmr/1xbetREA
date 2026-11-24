package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class qsp {
    public static final psp Companion = new psp();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xup f29268a;
    public final List b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{null, maz.a(wezVar, new dfp((byte) 13)), maz.a(wezVar, new dfp((byte) 14))};
    }

    public /* synthetic */ qsp(int i, xup xupVar, List list, List list2) {
        if ((i & 1) == 0) {
            this.f29268a = null;
        } else {
            this.f29268a = xupVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsp)) {
            return false;
        }
        qsp qspVar = (qsp) obj;
        return Intrinsics.d(this.f29268a, qspVar.f29268a) && Intrinsics.d(this.b, qspVar.b) && Intrinsics.d(this.c, qspVar.c);
    }

    public final int hashCode() {
        xup xupVar = this.f29268a;
        int iHashCode = (xupVar == null ? 0 : xupVar.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FightCornerStatsResponse(stats=");
        sb.append(this.f29268a);
        sb.append(", additionalStats=");
        sb.append(this.b);
        sb.append(", statsByRound=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
