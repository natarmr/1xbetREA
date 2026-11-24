package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class y5i0 {
    public static final v5i0 Companion = new v5i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f42048a;
    public final Integer b;
    public final String c;

    public /* synthetic */ y5i0(int i, Integer num, Integer num2, String str) {
        if ((i & 1) == 0) {
            this.f42048a = null;
        } else {
            this.f42048a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5i0)) {
            return false;
        }
        y5i0 y5i0Var = (y5i0) obj;
        return Intrinsics.d(this.f42048a, y5i0Var.f42048a) && Intrinsics.d(this.b, y5i0Var.b) && Intrinsics.d(this.c, y5i0Var.c);
    }

    public final int hashCode() {
        Integer num = this.f42048a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(hne.q("SelectorResponse(id=", this.f42048a, ", groupId=", this.b, ", title="), this.c, Separators.RPAREN);
    }
}
