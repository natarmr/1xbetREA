package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class y6m0 {
    public static final x6m0 Companion = new x6m0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new fzk0(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f42106a;
    public final List b;

    public /* synthetic */ y6m0(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f42106a = null;
        } else {
            this.f42106a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6m0)) {
            return false;
        }
        y6m0 y6m0Var = (y6m0) obj;
        return Intrinsics.d(this.f42106a, y6m0Var.f42106a) && Intrinsics.d(this.b, y6m0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f42106a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return kng0.h(this.f42106a, "StatInfoResponse(keyInfo=", ", valueInfo=", Separators.RPAREN, this.b);
    }
}
