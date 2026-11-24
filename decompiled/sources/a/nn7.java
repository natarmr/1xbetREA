package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class nn7 {
    public static final mn7 Companion = new mn7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f23806a;
    public final Integer b;
    public final Integer c;
    public final Double d;

    public /* synthetic */ nn7(int i, Integer num, Integer num2, Integer num3, Double d) {
        if ((i & 1) == 0) {
            this.f23806a = null;
        } else {
            this.f23806a = num;
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
            this.d = d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn7)) {
            return false;
        }
        nn7 nn7Var = (nn7) obj;
        return Intrinsics.d(this.f23806a, nn7Var.f23806a) && Intrinsics.d(this.b, nn7Var.b) && Intrinsics.d(this.c, nn7Var.c) && Intrinsics.d(this.d, nn7Var.d);
    }

    public final int hashCode() {
        Integer num = this.f23806a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d = this.d;
        return iHashCode3 + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("BetSystemResponse(betCount=", this.f23806a, ", countExpress=", this.b, ", dimension=");
        sbQ.append(this.c);
        sbQ.append(", sum=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
