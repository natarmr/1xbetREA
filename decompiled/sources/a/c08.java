package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class c08 {
    public static final b08 Companion = new b08();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f3511a;
    public final Integer b;

    public /* synthetic */ c08(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f3511a = null;
        } else {
            this.f3511a = num;
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
        if (!(obj instanceof c08)) {
            return false;
        }
        c08 c08Var = (c08) obj;
        return Intrinsics.d(this.f3511a, c08Var.f3511a) && Intrinsics.d(this.b, c08Var.b);
    }

    public final int hashCode() {
        Integer num = this.f3511a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.h("BigPigPointsResponse(pointsBeforeThrow=", this.f3511a, ", pointsAfterThrow=", this.b, Separators.RPAREN);
    }
}
