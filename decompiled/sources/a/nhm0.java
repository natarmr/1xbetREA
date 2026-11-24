package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class nhm0 {
    public static final mhm0 Companion = new mhm0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f23540a;
    public final String b;

    public /* synthetic */ nhm0(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f23540a = null;
        } else {
            this.f23540a = num;
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
        if (!(obj instanceof nhm0)) {
            return false;
        }
        nhm0 nhm0Var = (nhm0) obj;
        return Intrinsics.d(this.f23540a, nhm0Var.f23540a) && Intrinsics.d(this.b, nhm0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f23540a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f23540a, "StatisticsDictionariesItemResponse(id=", ", title=", this.b, Separators.RPAREN);
    }
}
