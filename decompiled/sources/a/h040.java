package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class h040 {
    public static final f040 Companion = new f040();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new gj30(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f12215a;
    public final String b;
    public final List c;

    public /* synthetic */ h040(int i, Integer num, String str, List list) {
        if ((i & 1) == 0) {
            this.f12215a = null;
        } else {
            this.f12215a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
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
        if (!(obj instanceof h040)) {
            return false;
        }
        h040 h040Var = (h040) obj;
        return Intrinsics.d(this.f12215a, h040Var.f12215a) && Intrinsics.d(this.b, h040Var.b) && Intrinsics.d(this.c, h040Var.c);
    }

    public final int hashCode() {
        Integer num = this.f12215a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(h97.n(this.f12215a, "MenuResponse(type=", ", name=", this.b, ", selectors="), this.c, Separators.RPAREN);
    }
}
