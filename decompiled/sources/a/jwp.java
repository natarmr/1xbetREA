package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class jwp {
    public static final iwp Companion = new iwp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f17263a;
    public final Integer b;
    public final Integer c;

    public /* synthetic */ jwp(int i, Integer num, Integer num2, Integer num3) {
        if ((i & 1) == 0) {
            this.f17263a = null;
        } else {
            this.f17263a = num;
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
        if (!(obj instanceof jwp)) {
            return false;
        }
        jwp jwpVar = (jwp) obj;
        return Intrinsics.d(this.f17263a, jwpVar.f17263a) && Intrinsics.d(this.b, jwpVar.b) && Intrinsics.d(this.c, jwpVar.c);
    }

    public final int hashCode() {
        Integer num = this.f17263a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(hne.q("FighterRecordResponse(wins=", this.f17263a, ", losses=", this.b, ", draws="), this.c, Separators.RPAREN);
    }
}
