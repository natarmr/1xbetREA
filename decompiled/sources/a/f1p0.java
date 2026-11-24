package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class f1p0 {
    public static final e1p0 Companion = new e1p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f8776a;
    public final Integer b;
    public final Integer c;

    public /* synthetic */ f1p0(int i, Integer num, Integer num2, Integer num3) {
        if ((i & 1) == 0) {
            this.f8776a = null;
        } else {
            this.f8776a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1p0)) {
            return false;
        }
        f1p0 f1p0Var = (f1p0) obj;
        return Intrinsics.d(this.f8776a, f1p0Var.f8776a) && Intrinsics.d(this.b, f1p0Var.b) && Intrinsics.d(this.c, f1p0Var.c);
    }

    public final int hashCode() {
        Integer num = this.f8776a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(hne.q("TeamBetOverallResponse(winCount=", this.f8776a, ", drawCount=", this.b, ", lossesCount="), this.c, Separators.RPAREN);
    }
}
