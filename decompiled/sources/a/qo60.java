package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class qo60 {
    public static final po60 Companion = new po60();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f29058a;
    public final be70 b;

    public /* synthetic */ qo60(int i, Integer num, be70 be70Var) {
        if ((i & 1) == 0) {
            this.f29058a = null;
        } else {
            this.f29058a = num;
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
        if (!(obj instanceof qo60)) {
            return false;
        }
        qo60 qo60Var = (qo60) obj;
        return Intrinsics.d(this.f29058a, qo60Var.f29058a) && this.b == qo60Var.b;
    }

    public final int hashCode() {
        Integer num = this.f29058a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        be70 be70Var = this.b;
        return iHashCode + (be70Var != null ? be70Var.hashCode() : 0);
    }

    public final String toString() {
        return "OneXGameWorkStatusResponse(gameId=" + this.f29058a + ", status=" + this.b + Separators.RPAREN;
    }
}
