package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class e6h0 {
    public static final a6h0 Companion = new a6h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7284a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final onq0 e;

    public /* synthetic */ e6h0(int i, String str, String str2, Integer num, Integer num2, onq0 onq0Var) {
        if ((i & 1) == 0) {
            this.f7284a = null;
        } else {
            this.f7284a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = onq0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6h0)) {
            return false;
        }
        e6h0 e6h0Var = (e6h0) obj;
        return Intrinsics.d(this.f7284a, e6h0Var.f7284a) && Intrinsics.d(this.b, e6h0Var.b) && Intrinsics.d(this.c, e6h0Var.c) && Intrinsics.d(this.d, e6h0Var.d) && Intrinsics.d(this.e, e6h0Var.e);
    }

    public final int hashCode() {
        String str = this.f7284a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        onq0 onq0Var = this.e;
        return iHashCode4 + (onq0Var != null ? onq0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ScoresResponse(fullScore=", this.f7284a, ", currentPeriodName=", this.b, ", scoreOpp1=");
        rz4.y(sbN, this.c, ", scoreOpp2=", this.d, ", timerResponse=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
