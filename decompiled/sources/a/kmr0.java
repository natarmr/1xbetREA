package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class kmr0 {
    public static final jmr0 Companion = new jmr0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f18556a;
    public final String b;

    public /* synthetic */ kmr0(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f18556a = null;
        } else {
            this.f18556a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmr0)) {
            return false;
        }
        kmr0 kmr0Var = (kmr0) obj;
        return Intrinsics.d(this.f18556a, kmr0Var.f18556a) && Intrinsics.d(this.b, kmr0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f18556a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f18556a, "TotoBetTypeDataResponse(id=", ", totoName=", this.b, Separators.RPAREN);
    }
}
