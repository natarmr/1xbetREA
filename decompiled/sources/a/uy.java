package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f36464a;
    public final Integer b;
    public final Integer c;

    public uy(Integer num, Integer num2, Integer num3) {
        this.f36464a = num;
        this.b = num2;
        this.c = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy)) {
            return false;
        }
        uy uyVar = (uy) obj;
        return Intrinsics.d(this.f36464a, uyVar.f36464a) && Intrinsics.d(this.b, uyVar.b) && Intrinsics.d(this.c, uyVar.c);
    }

    public final int hashCode() {
        Integer num = this.f36464a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(hne.q("AdditionalInfoUiModel(redCards=", this.f36464a, ", yellowCards=", this.b, ", corners="), this.c, Separators.RPAREN);
    }
}
