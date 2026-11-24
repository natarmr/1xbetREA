package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class uh6 {
    public static final th6 Companion = new th6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f35661a;
    public final String b;
    public final String c;

    public /* synthetic */ uh6(int i, Integer num, String str, String str2) {
        if ((i & 1) == 0) {
            this.f35661a = null;
        } else {
            this.f35661a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh6)) {
            return false;
        }
        uh6 uh6Var = (uh6) obj;
        return Intrinsics.d(this.f35661a, uh6Var.f35661a) && Intrinsics.d(this.b, uh6Var.b) && Intrinsics.d(this.c, uh6Var.c);
    }

    public final int hashCode() {
        Integer num = this.f35661a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(h97.n(this.f35661a, "BetBuilderInningStatResponse(number=", ", runs=", this.b, ", score="), this.c, Separators.RPAREN);
    }
}
