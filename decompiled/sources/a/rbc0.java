package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class rbc0 {
    public static final qbc0 Companion = new qbc0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new cbc0(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f30178a;
    public final List b;

    public /* synthetic */ rbc0(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f30178a = null;
        } else {
            this.f30178a = num;
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
        if (!(obj instanceof rbc0)) {
            return false;
        }
        rbc0 rbc0Var = (rbc0) obj;
        return Intrinsics.d(this.f30178a, rbc0Var.f30178a) && Intrinsics.d(this.b, rbc0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f30178a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return kng0.h(this.f30178a, "PromoCmsGetPromotionStageDrawResponse(stageId=", ", draws=", Separators.RPAREN, this.b);
    }
}
