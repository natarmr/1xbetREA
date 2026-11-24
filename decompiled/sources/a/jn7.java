package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class jn7 {
    public static final hn7 Companion = new hn7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f16799a;
    public final Integer b;
    public final Integer c;
    public final Double d;

    public /* synthetic */ jn7(int i, Integer num, Integer num2, Integer num3, Double d) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, fn7.f9819a.getDescriptor());
            throw null;
        }
        this.f16799a = num;
        this.b = num2;
        this.c = num3;
        this.d = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn7)) {
            return false;
        }
        jn7 jn7Var = (jn7) obj;
        return Intrinsics.d(this.f16799a, jn7Var.f16799a) && Intrinsics.d(this.b, jn7Var.b) && Intrinsics.d(this.c, jn7Var.c) && Intrinsics.d(this.d, jn7Var.d);
    }

    public final int hashCode() {
        Integer num = this.f16799a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d = this.d;
        return iHashCode3 + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("BetSystemRequest(betCount=", this.f16799a, ", countExpress=", this.b, ", dimension=");
        sbQ.append(this.c);
        sbQ.append(", sum=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public jn7(Integer num, Integer num2, Integer num3, Double d) {
        this.f16799a = num;
        this.b = num2;
        this.c = num3;
        this.d = d;
    }
}
