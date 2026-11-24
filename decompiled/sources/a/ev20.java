package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ev20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cwr0 f8449a;
    public final List b;
    public final int c;

    public ev20(cwr0 cwr0Var, lc00 lc00Var, int i) {
        lc00Var.getClass();
        this.f8449a = cwr0Var;
        this.b = lc00Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev20)) {
            return false;
        }
        ev20 ev20Var = (ev20) obj;
        return this.f8449a.equals(ev20Var.f8449a) && Intrinsics.d(this.b, ev20Var.b) && this.c == ev20Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + dw9.a(this.f8449a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGroupUiModel(bottomMarketHeader=");
        sb.append(this.f8449a);
        sb.append(", markets=");
        sb.append(this.b);
        sb.append(", maxColumn=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
