package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class r5l {
    public static final q5l Companion = new q5l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f29891a;
    public final Integer b;
    public final Integer c;

    public /* synthetic */ r5l(int i, Integer num, Integer num2, Integer num3) {
        if ((i & 1) == 0) {
            this.f29891a = null;
        } else {
            this.f29891a = num;
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
        if (!(obj instanceof r5l)) {
            return false;
        }
        r5l r5lVar = (r5l) obj;
        return Intrinsics.d(this.f29891a, r5lVar.f29891a) && Intrinsics.d(this.b, r5lVar.b) && Intrinsics.d(this.c, r5lVar.c);
    }

    public final int hashCode() {
        Integer num = this.f29891a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(hne.q("DotaMatchesResponse(loses=", this.f29891a, ", total=", this.b, ", wins="), this.c, Separators.RPAREN);
    }
}
