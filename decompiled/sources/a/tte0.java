package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class tte0 {
    public static final ste0 Companion = new ste0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f34508a;
    public final Integer b;

    public /* synthetic */ tte0(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f34508a = null;
        } else {
            this.f34508a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tte0)) {
            return false;
        }
        tte0 tte0Var = (tte0) obj;
        return Intrinsics.d(this.f34508a, tte0Var.f34508a) && Intrinsics.d(this.b, tte0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f34508a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.h("RegisterSendSmsResponse(expiryTime=", this.f34508a, ", canResendAfterTime=", this.b, Separators.RPAREN);
    }
}
