package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class bf90 {
    public static final ze90 Companion = new ze90();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f2492a;
    public final Integer b;
    public final Integer c;
    public final String d;

    public /* synthetic */ bf90(int i, Integer num, Integer num2, Integer num3, String str) {
        if ((i & 1) == 0) {
            this.f2492a = null;
        } else {
            this.f2492a = num;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf90)) {
            return false;
        }
        bf90 bf90Var = (bf90) obj;
        return Intrinsics.d(this.f2492a, bf90Var.f2492a) && Intrinsics.d(this.b, bf90Var.b) && Intrinsics.d(this.c, bf90Var.c) && Intrinsics.d(this.d, bf90Var.d);
    }

    public final int hashCode() {
        Integer num = this.f2492a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("PeriodScoreResponse(period=", this.f2492a, ", scoreOpp1=", this.b, ", scoreOpp2=");
        sbQ.append(this.c);
        sbQ.append(", periodName=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
