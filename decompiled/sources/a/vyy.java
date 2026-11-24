package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class vyy {
    public static final uyy Companion = new uyy();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38272a;
    public final aep0 b;
    public final Integer c;
    public final List d;

    static {
        zdp0 zdp0Var = aep0.Companion;
        wez wezVar = wez.f39042a;
        e = new a8z[]{maz.a(wezVar, new pcy((byte) 12)), null, null, maz.a(wezVar, new pcy((byte) 13))};
    }

    public /* synthetic */ vyy(int i, List list, aep0 aep0Var, Integer num, List list2) {
        if ((i & 1) == 0) {
            this.f38272a = null;
        } else {
            this.f38272a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = aep0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyy)) {
            return false;
        }
        vyy vyyVar = (vyy) obj;
        return Intrinsics.d(this.f38272a, vyyVar.f38272a) && Intrinsics.d(this.b, vyyVar.b) && Intrinsics.d(this.c, vyyVar.c) && Intrinsics.d(this.d, vyyVar.d);
    }

    public final int hashCode() {
        List list = this.f38272a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        aep0 aep0Var = this.b;
        int iHashCode2 = (iHashCode + (aep0Var == null ? 0 : aep0Var.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list2 = this.d;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "LastGameData(players=" + this.f38272a + ", teamGames=" + this.b + ", sportId=" + this.c + ", teamResponses=" + this.d + Separators.RPAREN;
    }
}
