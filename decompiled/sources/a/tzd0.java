package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class tzd0 {
    public static final szd0 Companion = new szd0();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34799a;
    public final f0e0 b;
    public final f0e0 c;
    public final List d;
    public final List e;

    static {
        e0e0 e0e0Var = f0e0.Companion;
        wez wezVar = wez.f39042a;
        f = new a8z[]{null, null, null, maz.a(wezVar, new etd0((byte) 13)), maz.a(wezVar, new etd0((byte) 14))};
    }

    public /* synthetic */ tzd0(int i, String str, f0e0 f0e0Var, f0e0 f0e0Var2, List list, List list2) {
        if ((i & 1) == 0) {
            this.f34799a = null;
        } else {
            this.f34799a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f0e0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = f0e0Var2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzd0)) {
            return false;
        }
        tzd0 tzd0Var = (tzd0) obj;
        return Intrinsics.d(this.f34799a, tzd0Var.f34799a) && Intrinsics.d(this.b, tzd0Var.b) && Intrinsics.d(this.c, tzd0Var.c) && Intrinsics.d(this.d, tzd0Var.d) && Intrinsics.d(this.e, tzd0Var.e);
    }

    public final int hashCode() {
        String str = this.f34799a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        f0e0 f0e0Var = this.b;
        int iHashCode2 = (iHashCode + (f0e0Var == null ? 0 : f0e0Var.hashCode())) * 31;
        f0e0 f0e0Var2 = this.c;
        int iHashCode3 = (iHashCode2 + (f0e0Var2 == null ? 0 : f0e0Var2.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RainbowStatisticMatchesMatchResponse(map=");
        sb.append(this.f34799a);
        sb.append(", team1=");
        sb.append(this.b);
        sb.append(", team2=");
        sb.append(this.c);
        sb.append(", rounds=");
        sb.append(this.d);
        sb.append(", operatorBans=");
        return dw9.r(sb, this.e, Separators.RPAREN);
    }
}
