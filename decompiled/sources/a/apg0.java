package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class apg0 {
    public static final zog0 Companion = new zog0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1251a;
    public final Integer b;
    public final Integer c;

    public /* synthetic */ apg0(int i, Integer num, Integer num2, Integer num3) {
        if ((i & 1) == 0) {
            this.f1251a = null;
        } else {
            this.f1251a = num;
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
        if (!(obj instanceof apg0)) {
            return false;
        }
        apg0 apg0Var = (apg0) obj;
        return Intrinsics.d(this.f1251a, apg0Var.f1251a) && Intrinsics.d(this.b, apg0Var.b) && Intrinsics.d(this.c, apg0Var.c);
    }

    public final int hashCode() {
        Integer num = this.f1251a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(hne.q("RussianLottoParamsResponse(positionX=", this.f1251a, ", positionY=", this.b, ", num="), this.c, Separators.RPAREN);
    }
}
