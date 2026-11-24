package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wj40 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vj40 f39246a;
    public final a4x b;

    public wj40(vj40 vj40Var, i4 i4Var) {
        vj40Var.getClass();
        i4Var.getClass();
        this.f39246a = vj40Var;
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj40)) {
            return false;
        }
        wj40 wj40Var = (wj40) obj;
        return this.f39246a == wj40Var.f39246a && Intrinsics.d(this.b, wj40Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "PLAYERS_STATISTIC";
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f39246a.hashCode() + 13817245) * 31);
    }

    public final String toString() {
        return "MlbbPlayersStatisticUiModel(key=PLAYERS_STATISTIC, tab=" + this.f39246a + ", tables=" + this.b + Separators.RPAREN;
    }
}
