package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class f410 {
    public static final e410 Companion = new e410();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f8890a;
    public final c410 b;
    public final z310 c;
    public final Integer d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{null, maz.a(wezVar, new t010((byte) 8)), maz.a(wezVar, new t010((byte) 9)), null};
    }

    public /* synthetic */ f410(int i, Long l, c410 c410Var, z310 z310Var, Integer num) {
        if ((i & 1) == 0) {
            this.f8890a = null;
        } else {
            this.f8890a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = c410Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = z310Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f410)) {
            return false;
        }
        f410 f410Var = (f410) obj;
        return Intrinsics.d(this.f8890a, f410Var.f8890a) && this.b == f410Var.b && this.c == f410Var.c && Intrinsics.d(this.d, f410Var.d);
    }

    public final int hashCode() {
        Long l = this.f8890a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        c410 c410Var = this.b;
        int iHashCode2 = (iHashCode + (c410Var == null ? 0 : c410Var.hashCode())) * 31;
        z310 z310Var = this.c;
        int iHashCode3 = (iHashCode2 + (z310Var == null ? 0 : z310Var.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "LolStatisticMatchesMatchObjectKillsResponse(teamId=" + this.f8890a + ", objectType=" + this.b + ", objectSubType=" + this.c + ", timeSeconds=" + this.d + Separators.RPAREN;
    }
}
