package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ar60 {
    public static final zq60 Companion = new zq60();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1331a;
    public final be70 b;

    public /* synthetic */ ar60(int i, Integer num, be70 be70Var) {
        if ((i & 1) == 0) {
            this.f1331a = null;
        } else {
            this.f1331a = num;
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
        if (!(obj instanceof ar60)) {
            return false;
        }
        ar60 ar60Var = (ar60) obj;
        return Intrinsics.d(this.f1331a, ar60Var.f1331a) && this.b == ar60Var.b;
    }

    public final int hashCode() {
        Integer num = this.f1331a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        be70 be70Var = this.b;
        return iHashCode + (be70Var != null ? be70Var.hashCode() : 0);
    }

    public final String toString() {
        return "OneXGamesActionsWorkStatusResponseOld(actionId=" + this.f1331a + ", status=" + this.b + Separators.RPAREN;
    }
}
