package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class yf8 {
    public static final xf8 Companion = new xf8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f42528a;
    public final String b;
    public final Integer c;

    public /* synthetic */ yf8(int i, Double d, String str, Integer num) {
        if ((i & 1) == 0) {
            this.f42528a = null;
        } else {
            this.f42528a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf8)) {
            return false;
        }
        yf8 yf8Var = (yf8) obj;
        return Intrinsics.d(this.f42528a, yf8Var.f42528a) && Intrinsics.d(this.b, yf8Var.b) && Intrinsics.d(this.c, yf8Var.c);
    }

    public final int hashCode() {
        Double d = this.f42528a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusPrizeResponse(amount=");
        sb.append(this.f42528a);
        sb.append(", currency=");
        sb.append(this.b);
        sb.append(", wager=");
        return dw9.q(sb, this.c, Separators.RPAREN);
    }
}
