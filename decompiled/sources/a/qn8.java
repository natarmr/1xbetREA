package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qn8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wul f29019a;
    public final wul b;

    public qn8(wul wulVar, wul wulVar2) {
        wulVar.getClass();
        this.f29019a = wulVar;
        this.b = wulVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn8)) {
            return false;
        }
        qn8 qn8Var = (qn8) obj;
        return Intrinsics.d(this.f29019a, qn8Var.f29019a) && Intrinsics.d(this.b, qn8Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f29019a.hashCode() * 31;
        wul wulVar = this.b;
        return iHashCode + (wulVar == null ? 0 : wulVar.hashCode());
    }

    public final String toString() {
        return "BottomContentUiModel(makeBetDsButtonUiModel=" + this.f29019a + ", addToCouponDsButtonUiModel=" + this.b + Separators.RPAREN;
    }
}
