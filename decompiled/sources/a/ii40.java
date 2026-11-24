package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ii40 implements p6t0, uxx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final li40 f14812a;
    public final ci40 b;
    public final ci40 c;

    public ii40(li40 li40Var, ci40 ci40Var, ci40 ci40Var2) {
        this.f14812a = li40Var;
        this.b = ci40Var;
        this.c = ci40Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii40)) {
            return false;
        }
        ii40 ii40Var = (ii40) obj;
        return this.f14812a.equals(ii40Var.f14812a) && Intrinsics.d(this.b, ii40Var.b) && Intrinsics.d(this.c, ii40Var.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "GAME_MAP";
    }

    public final int hashCode() {
        int iHashCode = (this.f14812a.hashCode() - 477881743) * 31;
        ci40 ci40Var = this.b;
        int iHashCode2 = (iHashCode + (ci40Var == null ? 0 : ci40Var.hashCode())) * 31;
        ci40 ci40Var2 = this.c;
        return iHashCode2 + (ci40Var2 != null ? ci40Var2.hashCode() : 0);
    }

    public final String toString() {
        return "MlbbGameMapUiModel(key=GAME_MAP, map=" + this.f14812a + ", lordCell=" + this.b + ", turtleCell=" + this.c + Separators.RPAREN;
    }
}
