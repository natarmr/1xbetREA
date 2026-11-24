package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class t3h {
    public static final s3h Companion = new s3h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f33266a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    public /* synthetic */ t3h(int i, Integer num, Integer num2, Integer num3, Integer num4) {
        if ((i & 1) == 0) {
            this.f33266a = null;
        } else {
            this.f33266a = num;
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
            this.d = num4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3h)) {
            return false;
        }
        t3h t3hVar = (t3h) obj;
        return Intrinsics.d(this.f33266a, t3hVar.f33266a) && Intrinsics.d(this.b, t3hVar.b) && Intrinsics.d(this.c, t3hVar.c) && Intrinsics.d(this.d, t3hVar.d);
    }

    public final int hashCode() {
        Integer num = this.f33266a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        return ua80.l(hne.q("CyberLolHeroStatisticInfoResponse(kills=", this.f33266a, ", deaths=", this.b, ", assists="), this.c, ", hitsCreepsCount=", this.d, Separators.RPAREN);
    }
}
