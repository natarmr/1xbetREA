package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class n0u0 {
    public static final m0u0 Companion = new m0u0();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22719a;
    public final v0u0 b;
    public final v0u0 c;
    public final List d;

    static {
        u0u0 u0u0Var = v0u0.Companion;
        e = new a8z[]{null, null, null, maz.a(wez.f39042a, new tht0((byte) 23))};
    }

    public /* synthetic */ n0u0(int i, String str, v0u0 v0u0Var, v0u0 v0u0Var2, List list) {
        if ((i & 1) == 0) {
            this.f22719a = null;
        } else {
            this.f22719a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = v0u0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = v0u0Var2;
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
        if (!(obj instanceof n0u0)) {
            return false;
        }
        n0u0 n0u0Var = (n0u0) obj;
        return Intrinsics.d(this.f22719a, n0u0Var.f22719a) && Intrinsics.d(this.b, n0u0Var.b) && Intrinsics.d(this.c, n0u0Var.c) && Intrinsics.d(this.d, n0u0Var.d);
    }

    public final int hashCode() {
        String str = this.f22719a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        v0u0 v0u0Var = this.b;
        int iHashCode2 = (iHashCode + (v0u0Var == null ? 0 : v0u0Var.hashCode())) * 31;
        v0u0 v0u0Var2 = this.c;
        int iHashCode3 = (iHashCode2 + (v0u0Var2 == null ? 0 : v0u0Var2.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ValorantStatisticMatchesMatchResponse(map=" + this.f22719a + ", team1=" + this.b + ", team2=" + this.c + ", economyGraph=" + this.d + Separators.RPAREN;
    }
}
