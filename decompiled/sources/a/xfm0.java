package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class xfm0 {
    public static final ufm0 Companion = new ufm0();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f40797a;
    public final Map b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new x9m0((byte) 3)), maz.a(wezVar, new x9m0((byte) 4))};
    }

    public /* synthetic */ xfm0(int i, Map map, Map map2) {
        if ((i & 1) == 0) {
            this.f40797a = null;
        } else {
            this.f40797a = map;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfm0)) {
            return false;
        }
        xfm0 xfm0Var = (xfm0) obj;
        return Intrinsics.d(this.f40797a, xfm0Var.f40797a) && Intrinsics.d(this.b, xfm0Var.b);
    }

    public final int hashCode() {
        Map map = this.f40797a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map map2 = this.b;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        return "StatisticResponse(main=" + this.f40797a + ", periodsWinners=" + this.b + Separators.RPAREN;
    }
}
