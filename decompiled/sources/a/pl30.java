package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class pl30 extends wl30 {
    public static final ol30 Companion = new ol30();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27163a;
    public final Integer b;
    public final Integer c;
    public final Boolean d;

    public pl30(int i, Boolean bool, Integer num, Integer num2, String str) {
        if ((i & 1) == 0) {
            this.f27163a = null;
        } else {
            this.f27163a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl30)) {
            return false;
        }
        pl30 pl30Var = (pl30) obj;
        return Intrinsics.d(this.f27163a, pl30Var.f27163a) && Intrinsics.d(this.b, pl30Var.b) && Intrinsics.d(this.c, pl30Var.c) && Intrinsics.d(this.d, pl30Var.d);
    }

    public final int hashCode() {
        String str = this.f27163a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "DocumentAttributeImage(type=", this.f27163a, ", height=", ", width=");
        sbP.append(this.c);
        sbP.append(", animated=");
        sbP.append(this.d);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
