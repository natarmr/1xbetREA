package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class c4g {
    public static final b4g Companion = new b4g();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new dpf((byte) 22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f3723a;
    public final Boolean b;
    public final List c;

    public /* synthetic */ c4g(int i, Boolean bool, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f3723a = null;
        } else {
            this.f3723a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
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
        if (!(obj instanceof c4g)) {
            return false;
        }
        c4g c4gVar = (c4g) obj;
        return Intrinsics.d(this.f3723a, c4gVar.f3723a) && Intrinsics.d(this.b, c4gVar.b) && Intrinsics.d(this.c, c4gVar.c);
    }

    public final int hashCode() {
        Integer num = this.f3723a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberCSMatchesStatisticMatchTeamResponse(score=");
        sb.append(this.f3723a);
        sb.append(", winner=");
        sb.append(this.b);
        sb.append(", players=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
