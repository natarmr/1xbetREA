package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class u310 {
    public static final t310 Companion = new t310();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f34974a;
    public final Integer b;

    public /* synthetic */ u310(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f34974a = null;
        } else {
            this.f34974a = num;
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
        if (!(obj instanceof u310)) {
            return false;
        }
        u310 u310Var = (u310) obj;
        return Intrinsics.d(this.f34974a, u310Var.f34974a) && Intrinsics.d(this.b, u310Var.b);
    }

    public final int hashCode() {
        Integer num = this.f34974a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.h("LolStatisticMatchesMatchGraphResponse(value=", this.f34974a, ", second=", this.b, Separators.RPAREN);
    }
}
