package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class xq60 {
    public static final wq60 Companion = new wq60();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f41302a;
    public final be70 b;

    public /* synthetic */ xq60(int i, Integer num, be70 be70Var) {
        if ((i & 1) == 0) {
            this.f41302a = null;
        } else {
            this.f41302a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = be70Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq60)) {
            return false;
        }
        xq60 xq60Var = (xq60) obj;
        return Intrinsics.d(this.f41302a, xq60Var.f41302a) && this.b == xq60Var.b;
    }

    public final int hashCode() {
        Integer num = this.f41302a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        be70 be70Var = this.b;
        return iHashCode + (be70Var != null ? be70Var.hashCode() : 0);
    }

    public final String toString() {
        return "OneXGamesActionsWorkStatusResponse(actionId=" + this.f41302a + ", status=" + this.b + Separators.RPAREN;
    }
}
