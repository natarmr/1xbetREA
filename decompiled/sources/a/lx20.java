package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lx20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20794a;
    public final String b;
    public final int c;
    public final ArrayList d;

    public lx20(long j, String str, int i, ArrayList arrayList) {
        str.getClass();
        this.f20794a = j;
        this.b = str;
        this.c = i;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx20)) {
            return false;
        }
        lx20 lx20Var = (lx20) obj;
        return this.f20794a == lx20Var.f20794a && Intrinsics.d(this.b, lx20Var.b) && this.c == lx20Var.c && this.d.equals(lx20Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, ua80.b(Long.hashCode(this.f20794a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f20794a, "MarketStatisticGraphUiModel(id=", ", name=", this.b);
        sbO.append(", index=");
        sbO.append(this.c);
        sbO.append(", items=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
