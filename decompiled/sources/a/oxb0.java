package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class oxb0 {
    public static final nxb0 Companion = new nxb0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f26004a;
    public final String b;

    public /* synthetic */ oxb0(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f26004a = null;
        } else {
            this.f26004a = num;
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
        if (!(obj instanceof oxb0)) {
            return false;
        }
        oxb0 oxb0Var = (oxb0) obj;
        return Intrinsics.d(this.f26004a, oxb0Var.f26004a) && Intrinsics.d(this.b, oxb0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f26004a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f26004a, "PrizeGameResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
