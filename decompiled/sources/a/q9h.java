package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class q9h {
    public static final p9h Companion = new p9h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f28346a;
    public final Integer b;
    public final Integer c;

    public /* synthetic */ q9h(int i, Integer num, Integer num2, Integer num3) {
        if ((i & 1) == 0) {
            this.f28346a = null;
        } else {
            this.f28346a = num;
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
        if (!(obj instanceof q9h)) {
            return false;
        }
        q9h q9hVar = (q9h) obj;
        return Intrinsics.d(this.f28346a, q9hVar.f28346a) && Intrinsics.d(this.b, q9hVar.b) && Intrinsics.d(this.c, q9hVar.c);
    }

    public final int hashCode() {
        Integer num = this.f28346a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(hne.q("CyberMlbbHeroStatisticResponse(kills=", this.f28346a, ", deaths=", this.b, ", assists="), this.c, Separators.RPAREN);
    }
}
