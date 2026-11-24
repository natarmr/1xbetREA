package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f38224a;
    public final Integer b;
    public final Integer c;

    public vy(Integer num, Integer num2, Integer num3) {
        this.f38224a = num;
        this.b = num2;
        this.c = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy)) {
            return false;
        }
        vy vyVar = (vy) obj;
        return Intrinsics.d(this.f38224a, vyVar.f38224a) && Intrinsics.d(this.b, vyVar.b) && Intrinsics.d(this.c, vyVar.c);
    }

    public final int hashCode() {
        Integer num = this.f38224a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(hne.q("AdditionalInfoUiModel(redCards=", this.f38224a, ", yellowCards=", this.b, ", corners="), this.c, Separators.RPAREN);
    }
}
