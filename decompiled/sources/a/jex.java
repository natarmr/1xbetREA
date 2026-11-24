package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class jex {
    public static final iex Companion = new iex();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f16398a;
    public final Integer b;
    public final Float c;

    public /* synthetic */ jex(int i, Integer num, Integer num2, Float f) {
        if ((i & 1) == 0) {
            this.f16398a = null;
        } else {
            this.f16398a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jex)) {
            return false;
        }
        jex jexVar = (jex) obj;
        return Intrinsics.d(this.f16398a, jexVar.f16398a) && Intrinsics.d(this.b, jexVar.b) && Intrinsics.d(this.c, jexVar.c);
    }

    public final int hashCode() {
        Integer num = this.f16398a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.c;
        return iHashCode2 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("InnsStatsResponse(team=", this.f16398a, ", wickets=", this.b, ", over=");
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
