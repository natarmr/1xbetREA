package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class h22 {
    public static final g22 Companion = new g22();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fpp0 f12311a;
    public final Integer b;
    public final List c;

    static {
        epp0 epp0Var = fpp0.Companion;
        d = new a8z[]{null, null, maz.a(wez.f39042a, new c51((byte) 28))};
    }

    public /* synthetic */ h22(int i, fpp0 fpp0Var, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f12311a = null;
        } else {
            this.f12311a = fpp0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h22)) {
            return false;
        }
        h22 h22Var = (h22) obj;
        return Intrinsics.d(this.f12311a, h22Var.f12311a) && Intrinsics.d(this.b, h22Var.b) && Intrinsics.d(this.c, h22Var.c);
    }

    public final int hashCode() {
        fpp0 fpp0Var = this.f12311a;
        int iHashCode = (fpp0Var == null ? 0 : fpp0Var.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AllCharacteristicModelResponse(teamsCharacteristics=");
        sb.append(this.f12311a);
        sb.append(", sportId=");
        sb.append(this.b);
        sb.append(", teams=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
