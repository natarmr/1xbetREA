package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class g7i0 {
    public static final f7i0 Companion = new f7i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f10815a;
    public final String b;

    public /* synthetic */ g7i0(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f10815a = null;
        } else {
            this.f10815a = num;
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
        if (!(obj instanceof g7i0)) {
            return false;
        }
        g7i0 g7i0Var = (g7i0) obj;
        return Intrinsics.d(this.f10815a, g7i0Var.f10815a) && Intrinsics.d(this.b, g7i0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f10815a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f10815a, "SelfExcludeReasonResponse(id=", ", selfExcludeReason=", this.b, Separators.RPAREN);
    }
}
